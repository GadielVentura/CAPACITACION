package mx.com.ids.practicacamel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder<num1> extends RouteBuilder {



    @Override
    public void configure() throws Exception {
         /* from("timer:foo?period={{myperiod}}")
        .bean("myBean","hello")
        .log("${body}")
        .bean("myBean", "bye")
        .log("${body}");
         */
        //from("componente:nombrex?parametros")
        from( "timer:myTimer?period=1s")
                .routeId("myTest")
                .log("Hola mundo...")
                        .end();


        from("timer:segundoTimer?period=3s")
                .log("Adios..")
                .to("direct:ruta1")
                .end();

        from("direct:ruta1")
                .log("procesando ruta 1")
                .end();
    }


}
