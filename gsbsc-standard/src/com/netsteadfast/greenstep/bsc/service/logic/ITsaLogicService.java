/* 
 * Copyright 2012-2017 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package com.netsteadfast.greenstep.bsc.service.logic;

import com.netsteadfast.greenstep.base.exception.ServiceException;
import com.netsteadfast.greenstep.base.model.DefaultResult;
import com.netsteadfast.greenstep.vo.TsaMaCoefficientsVO;
import com.netsteadfast.greenstep.vo.TsaMeasureFreqVO;
import com.netsteadfast.greenstep.vo.TsaVO;

public interface ITsaLogicService {
	
	public DefaultResult<TsaVO> create(TsaVO tsa, TsaMeasureFreqVO tsaMeasureFreq, TsaMaCoefficientsVO tsaMaCoefficients) throws ServiceException, Exception;
	
	public DefaultResult<TsaVO> update(TsaVO tsa, TsaMeasureFreqVO tsaMeasureFreq, TsaMaCoefficientsVO tsaMaCoefficients) throws ServiceException, Exception;
	
	public DefaultResult<Boolean> delete(TsaVO tsa) throws ServiceException, Exception;
	
}
