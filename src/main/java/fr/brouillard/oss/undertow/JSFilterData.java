/**
 * Copyright (C) 2018 Matthieu Brouillard [http://oss.brouillard.fr/undertow-jsfilters] (matthieu@brouillard.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.brouillard.oss.undertow;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

import java.util.logging.Logger;

public class JSFilterData {
    private final HttpServerExchange exchange;
    private final HttpHandler nextHttpHandler;
    private final Logger logger;

    public JSFilterData(HttpServerExchange exchange, HttpHandler next, Logger scriptLogger) {
        this.exchange = exchange;
        this.nextHttpHandler = next;
        this.logger = scriptLogger;
    }

    public HttpServerExchange getExchange() {
        return exchange;
    }

    public HttpHandler getNextHttpHandler() {
        return nextHttpHandler;
    }

    public Logger getLogger() {
        return logger;
    }

    public HttpString httpString(String s) {
        return HttpString.tryFromString(s);
    }
}
