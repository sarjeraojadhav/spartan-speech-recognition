package com.spartan.speechtotextservice;

import com.spartan.speechtotextservice.SpartanSpeechRecognitionApp;
import com.spartan.speechtotextservice.config.AsyncSyncConfiguration;
import com.spartan.speechtotextservice.config.EmbeddedKafka;
import com.spartan.speechtotextservice.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { SpartanSpeechRecognitionApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
