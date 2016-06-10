/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.websocket.springboot;

import java.util.Map;
import org.apache.camel.component.websocket.WebSocketFactory;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The websocket component provides websocket endpoints for communicating with
 * clients using websocket.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.websocket")
public class WebsocketComponentConfiguration {

    /**
     * Set a resource path for static resources (such as .html files etc). The
     * resources can be loaded from classpath if you prefix with classpath:
     * otherwise the resources is loaded from file system or from JAR files. For
     * example to load from root classpath use classpath:. or
     * classpath:WEB-INF/static If not configured (eg null) then no static
     * resource is in use.
     */
    private String staticResources;
    /**
     * The hostname. The default value is 0.0.0.0
     */
    private String host;
    /**
     * The port number. The default value is 9292
     */
    private Integer port;
    /**
     * The password for the keystore when using SSL.
     */
    private String sslKeyPassword;
    /**
     * The password when using SSL.
     */
    private String sslPassword;
    /**
     * The path to the keystore.
     */
    private String sslKeystore;
    /**
     * If this option is true Jetty JMX support will be enabled for this
     * endpoint. See Jetty JMX support for more details.
     */
    private boolean enableJmx;
    /**
     * To set a value for minimum number of threads in server thread pool.
     * MaxThreads/minThreads or threadPool fields are required due to switch to
     * Jetty9. The default values for minThreads is 1.
     */
    private Integer minThreads;
    /**
     * To set a value for maximum number of threads in server thread pool.
     * MaxThreads/minThreads or threadPool fields are required due to switch to
     * Jetty9. The default values for maxThreads is 1 2 noCores.
     */
    private Integer maxThreads;
    /**
     * To use a custom thread pool for the server. MaxThreads/minThreads or
     * threadPool fields are required due to switch to Jetty9.
     */
    private ThreadPool threadPool;
    /**
     * To configure security using SSLContextParameters
     */
    private SSLContextParameters sslContextParameters;
    /**
     * To configure a map which contains custom WebSocketFactory for sub
     * protocols. The key in the map is the sub protocol. The default key is
     * reserved for the default implementation.
     */
    private Map<java.lang.String, org.apache.camel.component.websocket.WebSocketFactory> socketFactory;

    public String getStaticResources() {
        return staticResources;
    }

    public void setStaticResources(String staticResources) {
        this.staticResources = staticResources;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getSslPassword() {
        return sslPassword;
    }

    public void setSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
    }

    public String getSslKeystore() {
        return sslKeystore;
    }

    public void setSslKeystore(String sslKeystore) {
        this.sslKeystore = sslKeystore;
    }

    public boolean isEnableJmx() {
        return enableJmx;
    }

    public void setEnableJmx(boolean enableJmx) {
        this.enableJmx = enableJmx;
    }

    public Integer getMinThreads() {
        return minThreads;
    }

    public void setMinThreads(Integer minThreads) {
        this.minThreads = minThreads;
    }

    public Integer getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
    }

    public ThreadPool getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Map<String, WebSocketFactory> getSocketFactory() {
        return socketFactory;
    }

    public void setSocketFactory(Map<String, WebSocketFactory> socketFactory) {
        this.socketFactory = socketFactory;
    }
}