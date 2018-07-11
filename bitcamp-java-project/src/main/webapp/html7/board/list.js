// 템플릿 엔진이 사용할 템플릿 데이터 가져오기
var trTemplateSrc = $("#tr-template").html();

// 위에서 준비한 템플릿 엔진 데이터를 가지고 템플릿 엔진을 준비
var templateFn = Handlebars.compile(trTemplateSrc);

$.getJSON(serverRoot + "/json/board/list", (data) => {
	// tableBody.innerHTML = templateFn({list:data});
	$(tableBody).html(templateFn({list:data}));
});