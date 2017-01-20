RESTful Resources:
------------------

	
	3) POST				http://localhost:3000/project
	
							Content-Type	application/hal+json;charset=UTF-8
		
							{
								"id":1,
								"name":"Order Management System(OMS)"
							}
		
	1) GET 				http://localhost:3000/project
	
	2) GET					http://localhost:3000/project/1
	
	4) PUT 				http://localhost:3000/project/1
	
							[N.B: /{Id} is necessary in URL path. ]
	
							{
								"id":1,
								"name":"Order Management System"
							}
							
	5) DELETE				http://localhost:3000/project/1
	
	
	
	String Id
	
	6) POST 				http://localhost:3000/project
	
							{
 								"id":"4",
 								"name":"J&J"
							}
	
	

Install Mongo DB
------------------

https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/#manually-create-a-windows-service-for-mongodb-community-edition
	