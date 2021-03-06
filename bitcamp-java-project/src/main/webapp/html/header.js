// div#header 태그에 /html/header.html 내용을 삽입한다.
var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java-project/html/header.html", false); // 동기 방식으로 요청한다.
xhr.send();
header.innerHTML = xhr.responseText; // 서버로 부터 받은 header를 페이지에 삽입한다.

// 로그인 정보를 가져와서 
var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java-project/json/auth/loginUser", false);
xhr.send();
if (xhr.responseText == "") {
	location.href = "/bitcamp-java-project/html/auth/login.html";
} else {
	var data = JSON.parse(xhr.responseText);
	username.textContent = data.id;
}