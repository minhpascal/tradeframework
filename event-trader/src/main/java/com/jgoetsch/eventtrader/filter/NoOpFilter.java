/*
 * Copyright (c) 2012 Jeremy Goetsch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jgoetsch.eventtrader.filter;

import java.util.Map;

import com.jgoetsch.eventtrader.Msg;

/**
 * Skips processing of TradeSignals marked as being a partial entry or exit.
 * (call <code>setInverse(true)</code> to process only partial trades).
 * 
 * @author jgoetsch
 *
 */
public class NoOpFilter<M extends Msg> extends FilterProcessor<M> {

	@Override
	protected boolean handleProcessing(M msg, Map<Object,Object> context) {
		return true;
	}

}
