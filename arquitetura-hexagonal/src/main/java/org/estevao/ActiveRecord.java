package org.estevao;

import org.jmolecules.ddd.annotation.Identity;

import java.util.Collections;
import java.util.List;

public class ActiveRecord {

    @Identity
    public Long id;

    public static<T extends ActiveRecord> List<T> listAll() {
        return Collections.emptyList();
    }
}
