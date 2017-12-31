package Annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

@BindingAnnotation
@Target( {  FIELD , METHOD , CONSTRUCTOR} )
@Retention(RUNTIME )
public @interface Sms { }
