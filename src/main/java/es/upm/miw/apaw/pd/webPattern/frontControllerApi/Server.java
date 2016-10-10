package es.upm.miw.apaw.pd.webPattern.frontControllerApi;

import es.upm.miw.apaw.pd.web.http.HttpRequest;
import es.upm.miw.apaw.pd.web.http.HttpResponse;
import es.upm.miw.apaw.pd.web.http.HttpStatus;

public class Server {
	private Dispatcher dispatcher = new Dispatcher();

	public HttpResponse request(HttpRequest request) {
		HttpResponse response = new HttpResponse();
		switch (request.getMethod()) {
		case POST:
			dispatcher.doPost(request, response);
			break;
		case GET:
			dispatcher.doGet(request, response);
			break;
		case PUT:
			dispatcher.doPut(request, response);
			break;
		case DELETE:
			dispatcher.doDelete(request, response);
			break;
		default:
		    response.setStatus(HttpStatus.BAD_REQUEST);
		}
		return response;
	}

}