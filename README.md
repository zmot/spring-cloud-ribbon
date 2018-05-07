# spring-cloud-ribbon
Spring Cloud Ribbon example - client-side load balancing

* `spring-cloud-ribbon-ws` - specifies a very basic service
  * <http://localhost:8080/lucky-number>
  * use spring profiles `one` or `two` to run multiple instances on `8081` or `8082` ports accordingly
* `spring-cloud-ribbon-client` - specifies a very basic client with client-side load balancing
  * <http://localhost:8080/my-number>
  * uses ribbon for calls to `lucky-number` service, load-balancing between two, hardcoded urls