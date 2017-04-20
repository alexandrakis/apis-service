package com.paymentcomponents.server.utils

/**
 * Created by a.polichronopoulos on 20-04-2017.
 */
class CommonUtils {

    public static def getBindProperties(def a) {
        def propsMap = a.properties
        propsMap.remove('metaClass')
        propsMap.remove('class')
        propsMap
    }

}
