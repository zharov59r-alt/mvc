package mvc.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CheckEmailValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckEmail {

    String message() default "incorrect Email";
    String value() default "xyz.com";

    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
