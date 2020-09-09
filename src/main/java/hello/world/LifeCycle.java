/*
 * $
 *
 * Copyright (c) 2020  Pegasystems Inc.
 * All rights reserved.
 *
 * This  software  has  been  provided pursuant  to  a  License
 * Agreement  containing  restrictions on  its  use.   The  software
 * contains  valuable  trade secrets and proprietary information  of
 * Pegasystems Inc and is protected by  federal   copyright law.  It
 * may  not be copied,  modified,  translated or distributed in  any
 * form or medium,  disclosed to third parties or used in any manner
 * not provided for in  said  License Agreement except with  written
 * authorization from Pegasystems Inc.
 */
package hello.world;


import io.micronaut.context.annotation.Context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

/**
 * @author vagrant
 * @version $ 9/9/20
 */

@Context
@Singleton
public class LifeCycle {
    public static final String COPYRIGHT = "Copyright (c) 2020  Pegasystems Inc.";
    @PostConstruct
    public void startUp(){
        System.out.println("in start up");
    }
    @PreDestroy
    public void shutDown(){
        System.out.println("in shut down");
    }
}
