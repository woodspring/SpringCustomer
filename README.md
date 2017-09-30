# SpringCustomer
# Service registers under this name
# Control the InternalResourceViewResolver:
spring:
   application:
      name: spring-client  
    
   mvc:
      view:
          prefix: /WEB-INF/views
          suffix: .jsp
          
          
# Discovery Server Access 
eureka:
    client:
        serviceUrl:
            defaultZone: http://localhost:1111/eureka/
            

# Disable Spring Boot's "Whitelabel" default error page, so we can use our own
error: 
    whitelabel:
        enable: false          
