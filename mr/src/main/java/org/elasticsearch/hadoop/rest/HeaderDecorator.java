package org.elasticsearch.hadoop.rest;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by luca.agostini on 21/08/2017.
 */
public interface HeaderDecorator {

    void setParams(Map<String, String> params);
    List<Header> getHeaders(HttpMethod method);

}
