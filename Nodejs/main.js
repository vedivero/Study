var http = require('http');
var fs = require('fs');
var url = require('url');

	var app = http.createServer(function(request,response){
    
	var _url = request.url;
    var queryData = url.parse(_url, true).query;
	var title = queryData.id;
    
	if(_url == '/'){
		title = 'Welcome';
	}
    
	if(_url == '/favicon.ico'){
      return response.writeHead(404);
    }
    
	response.writeHead(200);
	
	var template = `
		<!doctype html>
		<html>
			<head>
				<title>WEB1 - ${title}</title>
			<meta charset="utf-8">
			</head>
				<body>
					<h1><a href="/">WEB</a></h1>
		
			<ol>
			  <li><a href="/?id=HTML">HTML</a></li>
			  <li><a href="/?id=CSS">CSS</a></li>
			  <li><a href="/?id=JavaScript">JavaScript</a></li>
			</ol>
		
		<h2>${title}</h2>
		
		HTML (HyperText Markup Language) is the most basic building block of the Web.
		It defines the meaning and structure of web content.
		Other technologies besides HTML are generally used to describe a web page's
		appearance/presentation (CSS) or functionality/behavior (JavaScript).
			
			</body>
		</html>
	`;
	
    response.end(template);
 
});
app.listen(3000);