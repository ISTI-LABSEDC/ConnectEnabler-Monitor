 /*
  * GLIMPSE: A generic and flexible monitoring infrastructure.
  * For further information: http://labsewiki.isti.cnr.it/labse/tools/glimpse/public/main
  * 
  * Copyright (C) 2011  Software Engineering Laboratory - ISTI CNR - Pisa - Italy
  * 
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * 
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * 
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * 
*/
package it.cnr.isti.labse.glimpse.rules;

import it.cnr.isti.labse.glimpse.exceptions.IncorrectRuleFormatException;
import it.cnr.isti.labse.glimpse.exceptions.UnknownRuleException;
import it.cnr.isti.labse.glimpse.xml.complexEventRule.ComplexEventRuleActionType;

/**
 * 
 * 
 * 
 * @author Antonello Calabr&ograve;
 *
 */
public abstract class RulesManager {
	public RulesManager(Object knowledgeBuilder, Object knowledgeBase, Object knowledgeSession) {
	}
	abstract void insertRule(String rule, String ruleName) throws IncorrectRuleFormatException;
	abstract void deleteRule(String ruleName) throws UnknownRuleException;
	abstract void startRule(String ruleName) throws UnknownRuleException;
	abstract void stopRule(String ruleName) throws UnknownRuleException;
	abstract void restartRule(String ruleName) throws UnknownRuleException;
	public abstract Object[] loadRules(ComplexEventRuleActionType rules) throws IncorrectRuleFormatException; //it returns a vector contains the knowledge packages created from the request.
	public abstract void getLoadedRulesInfo();	
	public abstract int getLoadedKnowledgePackageCardinality();
}
