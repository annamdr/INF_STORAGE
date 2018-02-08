// dodanie nasłuchiwaczy
window.addEventListener('load', startClock, false);
window.addEventListener('load', modyfikacja, false);
window.addEventListener('load', canvasZegar, false);

function modyfikacja() {
    document.getElementById('aktual').innerHTML = document.lastModified;
}

function startClock() {
    updateClock();
    setInterval("updateClock()", 1000);
}

function updateClock() {
    node = document.getElementById("clock");

    now = new Date();
    node.innerHTML = now.toLocaleString();
}

// implementacja zegara w elemencie canvas
function canvasZegar() {
    var canvas = document.getElementById("canvas");
    var ctx = canvas.getContext("2d");
    var radius = canvas.height / 2;
    ctx.translate(radius, radius);
    radius = radius * 0.90;
    setInterval(drawClock, 1000);
    //rysowanie zegara
    function drawClock() {
        drawFace(ctx, radius);
        drawNumbers(ctx, radius);
        drawTime(ctx, radius);
    }
    //rysowanie tarczy
    function drawFace(ctx, radius) {
        var grad;
        ctx.beginPath();
        ctx.arc(0, 0, radius, 0, 3 * Math.PI);
        ctx.fillStyle = 'lightpink';
        ctx.fill();
        grad = ctx.createRadialGradient(0, 0, radius * 0.99, 0, 0, radius * 1.50);
        grad.addColorStop(0, '#665');
        grad.addColorStop(0.5, 'pink');
        grad.addColorStop(1, '#665');
        ctx.strokeStyle = grad;
        ctx.lineWidth = radius * 0.1;
        ctx.stroke();
        ctx.beginPath();
        ctx.arc(0, 0, radius * 0.1, 0, 2 * Math.PI);
        ctx.fillStyle = '#665';
        ctx.fill();
    }
    //rysowanie liczb na tarczy
    function drawNumbers(ctx, radius) {
        var ang;
        var num;
        ctx.font = radius * 0.30 + "px arial";
        ctx.textBaseline = "middle";
        ctx.textAlign = "center";
        for (num = 1; num < 13; num++) {
            ang = num * Math.PI / 6;
            ctx.rotate(ang);
            ctx.translate(0, -radius * 0.85);
            ctx.rotate(-ang);
            ctx.fillText(num.toString(), 0, 0);
            ctx.rotate(ang);
            ctx.translate(0, radius * 0.85);
            ctx.rotate(-ang);
        }
    }
    //wyznaczenie i pokazanie czasu
    function drawTime(ctx, radius) {
        var now = new Date();
        var hour = now.getHours();
        var minute = now.getMinutes();
        var second = now.getSeconds();
        //godziny
        hour = hour % 12;
        hour = (hour * Math.PI / 6) +
            (minute * Math.PI / (6 * 60)) +
            (second * Math.PI / (360 * 60));
        drawHand(ctx, hour, radius * 0.5, radius * 0.07);
        //minuty
        minute = (minute * Math.PI / 30) + (second * Math.PI / (30 * 60));
        drawHand(ctx, minute, radius * 0.8, radius * 0.07);
        //sekundy
        second = (second * Math.PI / 30);
        drawHand(ctx, second, radius * 0.9, radius * 0.02);
    }
    //rysowanie wskazówek
    function drawHand(ctx, pos, length, width) {
        ctx.beginPath();
        ctx.lineWidth = width;
        ctx.lineCap = "round";
        ctx.moveTo(0, 0);
        ctx.rotate(pos);
        ctx.lineTo(0, -length);
        ctx.stroke();
        ctx.rotate(-pos);
    }
}