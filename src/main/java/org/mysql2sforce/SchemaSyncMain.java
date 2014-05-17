package org.mysql2sforce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * SchemaSyncService
 *
 *
 *
 *
 * @author gbaker
 * @since 188
 */
public final class SchemaSyncMain {




    public static void main(String[] args) throws Exception {



        ApplicationContext context =  new FileSystemXmlApplicationContext(
                "src/main/resources/spring-config.xml"
        );

        SchemaMetadataService service = context.getBean(SchemaMetadataService.class);

        service.loadSchema();



    }







}
