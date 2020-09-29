// Generated from /Users/manleviet/Development/GitHub/CSP2ChocoTranslator/src/info/manleviet/csp2choco/translator/CSP2ChocoLexer.g4 by ANTLR 4.8
package info.manleviet.csp2choco.translator;


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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONSTRAINT=1, REQUIREMENT=2, CM=3, SC=4, LP=5, RP=6, MUL=7, DIV=8, ADD=9, 
		SUB=10, AND=11, OR=12, EQU=13, NEQ=14, GRT=15, LES=16, GRE=17, LEE=18, 
		IMP=19, IDENTIFIER=20, COMMENT=21, WS=22, INT_CONST=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONSTRAINT", "REQUIREMENT", "CM", "SC", "LP", "RP", "MUL", "DIV", "ADD", 
			"SUB", "AND", "OR", "EQU", "NEQ", "GRT", "LES", "GRE", "LEE", "IMP", 
			"IDENTIFIER", "COMMENT", "WS", "INT_CONST", "NEGATIVE", "NUMBER", "LETTER", 
			"DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'constraint'", "'requirement'", "','", "';'", "'('", "')'", "'*'", 
			"'/'", "'+'", "'-'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSTRAINT", "REQUIREMENT", "CM", "SC", "LP", "RP", "MUL", "DIV", 
			"ADD", "SUB", "AND", "OR", "EQU", "NEQ", "GRT", "LES", "GRE", "LEE", 
			"IMP", "IDENTIFIER", "COMMENT", "WS", "INT_CONST"
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
	public String getGrammarFileName() { return "CSP2ChocoLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\7\25}\n\25\f\25\16\25"+
		"\u0080\13\25\3\26\3\26\7\26\u0084\n\26\f\26\16\26\u0087\13\26\3\26\5\26"+
		"\u008a\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\5\31\u0098\n\31\3\32\3\32\3\32\7\32\u009d\n\32\f\32\16\32\u00a0\13\32"+
		"\5\32\u00a2\n\32\3\33\3\33\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\65\2\67\2\3\2\7\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\3\2\63;\5\2C\\aac|\3\2\62;\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\39\3\2\2\2\5D\3\2\2\2\7P\3\2\2\2"+
		"\tR\3\2\2\2\13T\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2"+
		"\2\25^\3\2\2\2\27`\3\2\2\2\31c\3\2\2\2\33f\3\2\2\2\35i\3\2\2\2\37l\3\2"+
		"\2\2!n\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)y\3\2\2\2+\u0081\3\2\2\2"+
		"-\u008f\3\2\2\2/\u0093\3\2\2\2\61\u0097\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3"+
		"\3\2\2\2\67\u00a5\3\2\2\29:\7e\2\2:;\7q\2\2;<\7p\2\2<=\7u\2\2=>\7v\2\2"+
		">?\7t\2\2?@\7c\2\2@A\7k\2\2AB\7p\2\2BC\7v\2\2C\4\3\2\2\2DE\7t\2\2EF\7"+
		"g\2\2FG\7s\2\2GH\7w\2\2HI\7k\2\2IJ\7t\2\2JK\7g\2\2KL\7o\2\2LM\7g\2\2M"+
		"N\7p\2\2NO\7v\2\2O\6\3\2\2\2PQ\7.\2\2Q\b\3\2\2\2RS\7=\2\2S\n\3\2\2\2T"+
		"U\7*\2\2U\f\3\2\2\2VW\7+\2\2W\16\3\2\2\2XY\7,\2\2Y\20\3\2\2\2Z[\7\61\2"+
		"\2[\22\3\2\2\2\\]\7-\2\2]\24\3\2\2\2^_\7/\2\2_\26\3\2\2\2`a\7(\2\2ab\7"+
		"(\2\2b\30\3\2\2\2cd\7~\2\2de\7~\2\2e\32\3\2\2\2fg\7?\2\2gh\7?\2\2h\34"+
		"\3\2\2\2ij\7#\2\2jk\7?\2\2k\36\3\2\2\2lm\7@\2\2m \3\2\2\2no\7>\2\2o\""+
		"\3\2\2\2pq\7@\2\2qr\7?\2\2r$\3\2\2\2st\7>\2\2tu\7?\2\2u&\3\2\2\2vw\7/"+
		"\2\2wx\7@\2\2x(\3\2\2\2y~\5\65\33\2z}\5\65\33\2{}\5\67\34\2|z\3\2\2\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0085\7\'\2\2\u0082\u0084\n\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\b\26\2\2\u008e,\3\2\2\2\u008f\u0090\t\3\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\b\27\2\2\u0092.\3\2\2\2\u0093\u0094\5\61\31\2\u0094"+
		"\u0095\5\63\32\2\u0095\60\3\2\2\2\u0096\u0098\7/\2\2\u0097\u0096\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\62\3\2\2\2\u0099\u00a2\7\62\2\2\u009a\u009e"+
		"\t\4\2\2\u009b\u009d\5\67\34\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009a\3\2\2\2\u00a2\64\3\2\2\2\u00a3"+
		"\u00a4\t\5\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a68\3\2\2\2\n\2"+
		"|~\u0085\u0089\u0097\u009e\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}