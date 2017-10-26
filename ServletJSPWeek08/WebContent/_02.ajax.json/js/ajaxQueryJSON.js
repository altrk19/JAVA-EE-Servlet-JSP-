function sendAjaxQueryJSON() {
	
	var postData = {
		name : $('#firstName').val(),           
		surname : $('#lastName').val(),
		gender : $('#gender').val()
	};		

	$.ajax({
		url : 'person.servlet',
		method : 'POST',													
		data : JSON.stringify(postData),
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(responseText) {                                  //responsetext aslında resultjson parametresidir.
			$('#ajaxGetUserServletResponse').text("deneme "+responseText.varResult1);
		}

	});
}
