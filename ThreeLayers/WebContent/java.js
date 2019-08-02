

function myUname2(){
	var a=document.f1.t1.value;
	f1.t1.value=a.toUpperCase();
	var regex=/[A-Za-z]{5,}/;
	if(a==a.match(regex)){
		
		document.getElementById('it1').innerHTML="<img src='correct1.jpg'class='rounded-circle' height='20px' width='30px'>";
	}
	else{		
		document.getElementById('it1').innerHTML="<img src='incorrect.png'class='rounded-circle' height='20px' width='30px'>";
	}
}
function myName2(){
	var a=document.f1.t2.value;
	f1.t2.value=a.toUpperCase();
	var regex=/[A-Za-z]{5,}/;
	if(a==a.match(regex)){
		document.getElementById('it2').innerHTML="<img src='correct1.jpg' class='rounded-circle' height='20px' width='30px'>";
	}
	else{
		
		
		document.getElementById('it2').innerHTML="<img src='incorrect.png'class='rounded-circle' height='20px' width='30px'>";
	}
}

function myContact(){
	var a=document.f1.t12.value;
	if(a.length==10){
		document.getElementById('it12').innerHTML="<img src='correct1.jpg'class='rounded-circle' height='20px' width='30px'>";
	}
	else{
		
		
		document.getElementById('it12').innerHTML="<img src='incorrect.png' class='rounded-circle' height='20px' width='30px'>";
	}
}
function myContact1(){
var a=document.f1.t12.value;
if(a.charAt(0)=='9' || a.charAt(0)=='7' ||a.charAt(0)=='8'){
	document.getElementById('it12').innerHTML="<img src='correct1.jpg'class='rounded-circle' height='20px' width='30px'>";
	}
else{
	document.getElementById('it12').innerHTML="<img src='incorrect.png' class='rounded-circle' height='20px' width='30px'>";
}
}
function myPass(){
	var a=document.f1.t4.value;
	
	var b=document.f1.t5.value;
		
	if(a==b && a.length!=0){
		document.getElementById('it5').innerHTML="<img src='correct1.jpg'class='rounded-circle' height='20px' width='30px'>";
		
	}
	else{
		
		
		document.getElementById('it5').innerHTML="<a href='#' data-toggle='popover' title='Password not matching' data-content='Some content inside the popoverhth4hy5y5yuh'><img src='incorrect.png' class='rounded-circle' height='20px' width='30px'></a>";
	}
}
function myPass2(){
	var a=document.f1.t4.value;
			
	if(a.length<5){
		document.getElementById('it4').innerHTML="<img src='correct1.jpg' class='rounded-circle' height='20px' width='30px'>&nbsp; &nbsp; <span class=' bg-white text-success'>'Poor Password'</span>";
	}
	else if(a.length<10 && a.length>5){
		document.getElementById('it4').innerHTML="<img src='correct1.jpg' class='rounded-circle' height='20px' width='30px'>&nbsp; &nbsp; <span class=' bg-white text-success'>'Good Password'</span>";
	
	}
	else{
		document.getElementById('it4').innerHTML="<img src='correct1.jpg' class='rounded-circle' height='20px' width='30px'>&nbsp; &nbsp; <span class=' bg-white text-success'>'Excellent Password'</span>";
	
	}
}
function myEmail(){
	var x=document.f1.t3.value;
	if(x.length<6){
		document.getElementById('it3').innerHTML='Invalid Email';
		return false;
	}
	else{
	var atposition=x.indexOf("@");
	var dotposition=x.lastIndexOf(".");
	if(atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){
		document.getElementById('it3').innerHTML='Invalid Email';
	return false;}
	else{
		document.getElementById('it3').innerHTML="<img src='correct1.jpg' class='rounded-circle' height='20px' width='30px'>&nbsp; &nbsp; <span class=' bg-white text-success'>Valid Mail</span>";}
	}
}
		
function myFunction(){
	var a=document.f1.t2.value;
	emp={name: a};
	document.getElementById('it3').innerHTML="Hello "+emp.name+" now you can Login";
}
function myDate(){
	var a=document.f1.t6.value;
	var date=new Date(a);
	var yr=Number(date.getFullYear());
	var dd=2000;
	if(yr>dd){
		document.getElementById('it6').innerHTML="Invalid date";
	}
	else{
		document.getElementById('it6').innerHTML="valid date";
	}
}
function window1(){
open("login.html");
}
function window3(){
open("formEx.html");
}
function window2(){
window.close();
}