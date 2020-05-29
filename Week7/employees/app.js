
const config = {
	apiKey: "AIzaSyAPgYsKhIQ8MN1T7YcuARi_RQerU194B4o",
	authDomain: "brothing-790da.firebaseapp.com",
	databaseURL: "https://brothing-790da.firebaseio.com",
	storageBucket: "brothing-790da.appspot.com"
};
firebase.initializeApp(config);

var ref = firebase.database().ref();

ref.on("value", function(snapshot) {
	grows = snapshot.val();
	document.getElementById("ackg").innerHTML="Done Downloading";
	console.log("done");
}, function (error) {
	console.log("Error: " + error.code);
});