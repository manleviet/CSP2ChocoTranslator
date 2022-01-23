/*
 * CSP2ChocoTranslator
 *
 * Copyright (c) 2022
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

// Generated from /Users/manleviet/Development/GitHub/CSP2ChocoTranslator/src/main/java/at/tugraz/ist/ase/csp2choco/antlr/CSP2Choco.g4 by ANTLR 4.9.2
package at.tugraz.ist.ase.csp2choco.antlr;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSP2ChocoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CONSTRAINT=2, REQUIREMENT=3, CM=4, SC=5, LP=6, RP=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, AND=12, OR=13, EQU=14, NEQ=15, GRT=16, LES=17, GRE=18, 
		LEE=19, IMP=20, IDENTIFIER=21, COMMENT=22, WS=23, INT_CONST=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CONSTRAINT", "REQUIREMENT", "CM", "SC", "LP", "RP", "MUL", "DIV", 
			"ADD", "SUB", "AND", "OR", "EQU", "NEQ", "GRT", "LES", "GRE", "LEE", 
			"IMP", "IDENTIFIER", "COMMENT", "WS", "INT_CONST", "NEGATIVE", "NUMBER", 
			"LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'constraint'", "'requirement'", "','", "';'", "'('", "')'", 
			"'*'", "'/'", "'+'", "'-'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CONSTRAINT", "REQUIREMENT", "CM", "SC", "LP", "RP", "MUL", 
			"DIV", "ADD", "SUB", "AND", "OR", "EQU", "NEQ", "GRT", "LES", "GRE", 
			"LEE", "IMP", "IDENTIFIER", "COMMENT", "WS", "INT_CONST"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CSP2ChocoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSP2Choco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\7\26\u0081\n\26\f\26\16\26\u0084\13\26\3\27\3\27\7\27\u0088\n\27\f\27"+
		"\16\27\u008b\13\27\3\27\5\27\u008e\n\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\5\32\u009c\n\32\3\33\3\33\3\33\7\33\u00a1"+
		"\n\33\f\33\16\33\u00a4\13\33\5\33\u00a6\n\33\3\34\3\34\3\35\3\35\2\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2\3\2\7"+
		"\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\63;\5\2C\\aac|\3\2\62;\2\u00ad\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7H\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2"+
		"\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2"+
		"\2\31d\3\2\2\2\33g\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#r\3\2\2\2"+
		"%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\u0085\3\2\2\2/\u0093\3\2\2"+
		"\2\61\u0097\3\2\2\2\63\u009b\3\2\2\2\65\u00a5\3\2\2\2\67\u00a7\3\2\2\2"+
		"9\u00a9\3\2\2\2;<\7#\2\2<\4\3\2\2\2=>\7e\2\2>?\7q\2\2?@\7p\2\2@A\7u\2"+
		"\2AB\7v\2\2BC\7t\2\2CD\7c\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\6\3\2\2\2HI"+
		"\7t\2\2IJ\7g\2\2JK\7s\2\2KL\7w\2\2LM\7k\2\2MN\7t\2\2NO\7g\2\2OP\7o\2\2"+
		"PQ\7g\2\2QR\7p\2\2RS\7v\2\2S\b\3\2\2\2TU\7.\2\2U\n\3\2\2\2VW\7=\2\2W\f"+
		"\3\2\2\2XY\7*\2\2Y\16\3\2\2\2Z[\7+\2\2[\20\3\2\2\2\\]\7,\2\2]\22\3\2\2"+
		"\2^_\7\61\2\2_\24\3\2\2\2`a\7-\2\2a\26\3\2\2\2bc\7/\2\2c\30\3\2\2\2de"+
		"\7(\2\2ef\7(\2\2f\32\3\2\2\2gh\7~\2\2hi\7~\2\2i\34\3\2\2\2jk\7?\2\2kl"+
		"\7?\2\2l\36\3\2\2\2mn\7#\2\2no\7?\2\2o \3\2\2\2pq\7@\2\2q\"\3\2\2\2rs"+
		"\7>\2\2s$\3\2\2\2tu\7@\2\2uv\7?\2\2v&\3\2\2\2wx\7>\2\2xy\7?\2\2y(\3\2"+
		"\2\2z{\7/\2\2{|\7@\2\2|*\3\2\2\2}\u0082\5\67\34\2~\u0081\5\67\34\2\177"+
		"\u0081\59\35\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083,\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0089\7\'\2\2\u0086\u0088\n\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\27\2\2\u0092.\3\2\2\2\u0093\u0094\t\3\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0096\b\30\2\2\u0096\60\3\2\2\2\u0097\u0098\5\63\32\2\u0098\u0099"+
		"\5\65\33\2\u0099\62\3\2\2\2\u009a\u009c\7/\2\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\64\3\2\2\2\u009d\u00a6\7\62\2\2\u009e\u00a2\t\4\2"+
		"\2\u009f\u00a1\59\35\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\66\3\2\2\2\u00a7\u00a8\t\5\2"+
		"\2\u00a88\3\2\2\2\u00a9\u00aa\t\6\2\2\u00aa:\3\2\2\2\n\2\u0080\u0082\u0089"+
		"\u008d\u009b\u00a2\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}