package com.Konovalov;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Towa on 16.04.2018.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface SaveTo {
    String patch();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Saver {
}
