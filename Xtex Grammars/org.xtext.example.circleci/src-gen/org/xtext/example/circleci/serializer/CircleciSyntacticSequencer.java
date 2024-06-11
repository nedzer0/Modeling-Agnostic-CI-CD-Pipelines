/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.circleci.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.circleci.services.CircleciGrammarAccess;

@SuppressWarnings("all")
public class CircleciSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CircleciGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Checkout___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_3__q;
	protected AbstractElementAlias match_Matrix___Matrix_excludeKeyword_1_2_0_BEGINTerminalRuleCall_1_2_1_0_ENDTerminalRuleCall_1_2_1_2__q;
	protected AbstractElementAlias match_Pipeline_NEWLINETerminalRuleCall_3_1_q;
	protected AbstractElementAlias match_Pipeline_NEWLINETerminalRuleCall_4_1_q;
	protected AbstractElementAlias match_Pipeline_NEWLINETerminalRuleCall_5_1_q;
	protected AbstractElementAlias match_Pipeline_NEWLINETerminalRuleCall_6_1_q;
	protected AbstractElementAlias match_Pipeline_NEWLINETerminalRuleCall_7_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CircleciGrammarAccess) access;
		match_Checkout___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCheckoutAccess().getBEGINTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getCheckoutAccess().getENDTerminalRuleCall_2_3()));
		match_Matrix___Matrix_excludeKeyword_1_2_0_BEGINTerminalRuleCall_1_2_1_0_ENDTerminalRuleCall_1_2_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMatrixAccess().getMatrix_excludeKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_2_1_0()), new TokenAlias(false, false, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_2_1_2()));
		match_Pipeline_NEWLINETerminalRuleCall_3_1_q = new TokenAlias(false, true, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_3_1());
		match_Pipeline_NEWLINETerminalRuleCall_4_1_q = new TokenAlias(false, true, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_4_1());
		match_Pipeline_NEWLINETerminalRuleCall_5_1_q = new TokenAlias(false, true, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_5_1());
		match_Pipeline_NEWLINETerminalRuleCall_6_1_q = new TokenAlias(false, true, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_6_1());
		match_Pipeline_NEWLINETerminalRuleCall_7_1_q = new TokenAlias(false, true, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_7_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * terminal NEWLINE:
	 *     '\r'? '\n';
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Checkout___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_3__q.equals(syntax))
				emit_Checkout___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Matrix___Matrix_excludeKeyword_1_2_0_BEGINTerminalRuleCall_1_2_1_0_ENDTerminalRuleCall_1_2_1_2__q.equals(syntax))
				emit_Matrix___Matrix_excludeKeyword_1_2_0_BEGINTerminalRuleCall_1_2_1_0_ENDTerminalRuleCall_1_2_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pipeline_NEWLINETerminalRuleCall_3_1_q.equals(syntax))
				emit_Pipeline_NEWLINETerminalRuleCall_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pipeline_NEWLINETerminalRuleCall_4_1_q.equals(syntax))
				emit_Pipeline_NEWLINETerminalRuleCall_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pipeline_NEWLINETerminalRuleCall_5_1_q.equals(syntax))
				emit_Pipeline_NEWLINETerminalRuleCall_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pipeline_NEWLINETerminalRuleCall_6_1_q.equals(syntax))
				emit_Pipeline_NEWLINETerminalRuleCall_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pipeline_NEWLINETerminalRuleCall_7_1_q.equals(syntax))
				emit_Pipeline_NEWLINETerminalRuleCall_7_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Checkout' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Checkout___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('matrix_exclude' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Matrix' BEGIN (ambiguity) 'matrix_params' BEGIN matrix_params+=MatrixParams
	 *     alias=EString (ambiguity) 'matrix_params' BEGIN matrix_params+=MatrixParams
	 
	 * </pre>
	 */
	protected void emit_Matrix___Matrix_excludeKeyword_1_2_0_BEGINTerminalRuleCall_1_2_1_0_ENDTerminalRuleCall_1_2_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NEWLINE?
	 *
	 * This ambiguous syntax occurs at:
	 *     orbs+=Orb (ambiguity) commands+=Command
	 *     orbs+=Orb (ambiguity) executors+=Executor
	 
	 * </pre>
	 */
	protected void emit_Pipeline_NEWLINETerminalRuleCall_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NEWLINE?
	 *
	 * This ambiguous syntax occurs at:
	 *     commands+=Command (ambiguity) executors+=Executor
	 
	 * </pre>
	 */
	protected void emit_Pipeline_NEWLINETerminalRuleCall_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NEWLINE?
	 *
	 * This ambiguous syntax occurs at:
	 *     executors+=Executor (ambiguity) jobs+=Job
	 
	 * </pre>
	 */
	protected void emit_Pipeline_NEWLINETerminalRuleCall_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NEWLINE?
	 *
	 * This ambiguous syntax occurs at:
	 *     jobs+=Job (ambiguity) (rule end)
	 *     jobs+=Job (ambiguity) workflows+=Workflow
	 
	 * </pre>
	 */
	protected void emit_Pipeline_NEWLINETerminalRuleCall_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NEWLINE?
	 *
	 * This ambiguous syntax occurs at:
	 *     workflows+=Workflow (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pipeline_NEWLINETerminalRuleCall_7_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
