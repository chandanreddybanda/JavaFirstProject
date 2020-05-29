var a,b,c;

function process(){
	var x = document.getElementById("frm1");
	a = x.elements[0].value;
	console.log(grows);
	var table = document.createElement("table");
	for(var i=1;i<grows.length;i++){
		var cells = grows[i];
		if((a==""||a==cells['name'].toString())){
			var row = table.insertRow(-1);
			var cell = row.insertCell(-1);
            cell.innerHTML = cells['name'];
            cell = row.insertCell(-1);
            cell.innerHTML = cells['id'];
            cell = row.insertCell(-1);
            cell.innerHTML = cells['salary'];
            cell = row.insertCell(-1);
            cell.innerHTML = cells['experience'];
		}
	}
	var dvCSV = document.getElementById("dvCSV");
    dvCSV.innerHTML = "";
    dvCSV.appendChild(table);
}
