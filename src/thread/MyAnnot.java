package thread;

/**
 * Created by szeru on 12/17/2018
 */

import com.sun.istack.internal.Interned;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PACKAGE})
public @interface MyAnnot {
}
