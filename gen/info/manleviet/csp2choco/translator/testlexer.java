// Generated from /Users/manleviet/Development/GitHub/CSP2ChocoTranslator/src/info/manleviet/csp2choco/translator/testlexer.g4 by ANTLR 4.8
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
public class testlexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FM4CONFversion=1, MODELNAME=2, FEATURE=3, RELATIONSHIP=4, CONSTRAINT=5, 
		MANDATORY=6, OPTIONAL=7, ALTERNATIVE=8, OR=9, REQUIRES=10, EXCLUDES=11, 
		NAME=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FM4CONFversion", "MODELNAME", "FEATURE", "RELATIONSHIP", "CONSTRAINT", 
			"MANDATORY", "OPTIONAL", "ALTERNATIVE", "OR", "REQUIRES", "EXCLUDES", 
			"NAME", "WS", "ID", "ID_HEAD", "ID_TAIL", "LETTER", "DIGIT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'FM4Conf-v1.0'", "'MODEL'", "'FEATURES:'", "'RELATIONSHIPS:'", 
			"'CONSTRAINTS:'", "'mandatory'", "'optional'", "'alternative'", "'or'", 
			"'requires'", "'excludes'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FM4CONFversion", "MODELNAME", "FEATURE", "RELATIONSHIP", "CONSTRAINT", 
			"MANDATORY", "OPTIONAL", "ALTERNATIVE", "OR", "REQUIRES", "EXCLUDES", 
			"NAME", "WS"
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


	public testlexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "testlexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\r\u009b\n\r\f\r\16\r\u009e\13\r\3\16\6\16\u00a1\n\16\r\16\16\16\u00a2"+
		"\3\16\3\16\3\17\3\17\7\17\u00a9\n\17\f\17\16\17\u00ac\13\17\3\20\3\20"+
		"\3\21\3\21\5\21\u00b2\n\21\3\22\3\22\3\23\3\23\3\24\6\24\u00b9\n\24\r"+
		"\24\16\24\u00ba\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2\3\2\5\5\2\13\f\17\17\"\"\5\2C\\"+
		"aac|\3\2\62;\2\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3)\3\2\2\2\5\66\3\2\2\2"+
		"\7<\3\2\2\2\tF\3\2\2\2\13U\3\2\2\2\rb\3\2\2\2\17l\3\2\2\2\21u\3\2\2\2"+
		"\23\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u008d\3\2\2\2\31\u0096\3\2\2\2\33"+
		"\u00a0\3\2\2\2\35\u00a6\3\2\2\2\37\u00ad\3\2\2\2!\u00b1\3\2\2\2#\u00b3"+
		"\3\2\2\2%\u00b5\3\2\2\2\'\u00b8\3\2\2\2)*\7H\2\2*+\7O\2\2+,\7\66\2\2,"+
		"-\7E\2\2-.\7q\2\2./\7p\2\2/\60\7h\2\2\60\61\7/\2\2\61\62\7x\2\2\62\63"+
		"\7\63\2\2\63\64\7\60\2\2\64\65\7\62\2\2\65\4\3\2\2\2\66\67\7O\2\2\678"+
		"\7Q\2\289\7F\2\29:\7G\2\2:;\7N\2\2;\6\3\2\2\2<=\7H\2\2=>\7G\2\2>?\7C\2"+
		"\2?@\7V\2\2@A\7W\2\2AB\7T\2\2BC\7G\2\2CD\7U\2\2DE\7<\2\2E\b\3\2\2\2FG"+
		"\7T\2\2GH\7G\2\2HI\7N\2\2IJ\7C\2\2JK\7V\2\2KL\7K\2\2LM\7Q\2\2MN\7P\2\2"+
		"NO\7U\2\2OP\7J\2\2PQ\7K\2\2QR\7R\2\2RS\7U\2\2ST\7<\2\2T\n\3\2\2\2UV\7"+
		"E\2\2VW\7Q\2\2WX\7P\2\2XY\7U\2\2YZ\7V\2\2Z[\7T\2\2[\\\7C\2\2\\]\7K\2\2"+
		"]^\7P\2\2^_\7V\2\2_`\7U\2\2`a\7<\2\2a\f\3\2\2\2bc\7o\2\2cd\7c\2\2de\7"+
		"p\2\2ef\7f\2\2fg\7c\2\2gh\7v\2\2hi\7q\2\2ij\7t\2\2jk\7{\2\2k\16\3\2\2"+
		"\2lm\7q\2\2mn\7r\2\2no\7v\2\2op\7k\2\2pq\7q\2\2qr\7p\2\2rs\7c\2\2st\7"+
		"n\2\2t\20\3\2\2\2uv\7c\2\2vw\7n\2\2wx\7v\2\2xy\7g\2\2yz\7t\2\2z{\7p\2"+
		"\2{|\7c\2\2|}\7v\2\2}~\7k\2\2~\177\7x\2\2\177\u0080\7g\2\2\u0080\22\3"+
		"\2\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7s\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7u\2\2"+
		"\u008c\26\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7z\2\2\u008f\u0090\7"+
		"e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7w\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7u\2\2\u0095\30\3\2\2\2\u0096\u009c\5\35\17\2\u0097"+
		"\u0098\5\'\24\2\u0098\u0099\5\35\17\2\u0099\u009b\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\b\16\2\2\u00a5\34\3\2\2\2\u00a6\u00aa\5\37\20\2\u00a7"+
		"\u00a9\5!\21\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\36\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\5#\22\2\u00ae \3\2\2\2\u00af\u00b2\5#\22\2\u00b0\u00b2\5%\23\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\t\3\2\2"+
		"\u00b4$\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6&\3\2\2\2\u00b7\u00b9\7\"\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb(\3\2\2\2\b\2\u009c\u00a2\u00aa\u00b1\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}