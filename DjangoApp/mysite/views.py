from django.shortcuts import render
from django.http import HttpResponse #this is only required for hours_ahead()
import datetime

def hello(request):
	return HttpResponse("Hello world!")
	
def current_datetime(request):
	now = datetime.datetime.now()
	return render(request, 'current_datetime.html', {'current_date': now})
	#t = get_template('current_datetime.html')
	#html = t.render(Context({'current_date': now}))
	#return HttpResponse(html)
	
def hours_ahead(request, offset):
	try:
		offset = int(offset)
	except ValueError:
		raise Http404()
	dt = datetime.datetime.now() + datetime.timedelta(hours=offset)
	return render(request, 'hours_ahead.html',{'hour_offset': offset, 'next_time': dt})
		#html = "<html><body>In %s hours(s), it will be %s.</body></html>" % (offset, dt)
	#return HttpResponse(html)
		
def search(request):
	errors = []
	if 'q' in request.GET:
		q = request.GET['q']
		if not q:
			errors.append('Enter a search term.')
		elif len(q) > 20:
			errors.append('Please enter at most 20 characters.')
		else:
			message = 'You search for %r' % q
			return HttpResponse(message)
	return render(request, 'search_form.html', {'errors': errors})
	