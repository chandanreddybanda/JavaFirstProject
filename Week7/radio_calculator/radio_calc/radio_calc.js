function sum(){
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    var c = document.getElementById("c");
    document.getElementById("sign").innerHTML = " +";
    c.value = parseInt(a)+parseInt(b);
}
function sub(){
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    var c = document.getElementById("c");
    document.getElementById("sign").innerHTML = " -";
    c.value = parseInt(a)-parseInt(b);
}
function pro(){
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    var c = document.getElementById("c");
    document.getElementById("sign").innerHTML = " *";
    c.value = parseInt(a)*parseInt(b);
}
function div(){
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    var c = document.getElementById("c");
    document.getElementById("sign").innerHTML = " /";
    c.value = parseInt(a)/parseInt(b);
}
