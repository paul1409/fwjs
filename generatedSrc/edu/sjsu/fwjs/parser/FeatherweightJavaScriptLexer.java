// Generated from FeatherweightJavaScript.g4 by ANTLR 4.7.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatherweightJavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, ELSE=6, WHILE=7, FUNCTION=8, VAR=9, 
		PRINT=10, INT=11, BOOL=12, NULL=13, MUL=14, DIV=15, SEPARATOR=16, ADD=17, 
		SUB=18, MOD=19, LT=20, GT=21, LE=22, GE=23, EQ=24, SET=25, ARGSEP=26, 
		ID=27, NEWLINE=28, LINE_COMMENT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "IF", "ELSE", "WHILE", "FUNCTION", "VAR", 
		"PRINT", "INT", "BOOL", "NULL", "MUL", "DIV", "SEPARATOR", "ADD", "SUB", 
		"MOD", "LT", "GT", "LE", "GE", "EQ", "SET", "ARGSEP", "ID", "NEWLINE", 
		"LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'while'", "'function'", 
		"'var'", "'print'", null, null, "'null'", "'*'", "'/'", "';'", "'+'", 
		"'-'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "ELSE", "WHILE", "FUNCTION", "VAR", 
		"PRINT", "INT", "BOOL", "NULL", "MUL", "DIV", "SEPARATOR", "ADD", "SUB", 
		"MOD", "LT", "GT", "LE", "GE", "EQ", "SET", "ARGSEP", "ID", "NEWLINE", 
		"LINE_COMMENT", "WS"
	};
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


	public FeatherweightJavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\5\fq\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\7\34\u00a2\n\34\f\34\16\34\u00a5\13\34\3\35\5\35\u00a8\n\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00b2\n\36\f\36\16\36\u00b5"+
		"\13\36\3\36\3\36\3\37\6\37\u00ba\n\37\r\37\16\37\u00bb\3\37\3\37\2\2 "+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= \3\2\b\3\2\63;\3\2\62;\6\2C\\aac|~~\7\2\62;C\\aac|~~\4\2\f\f\17\17\4"+
		"\2\13\13\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2"+
		"\tE\3\2\2\2\13G\3\2\2\2\rJ\3\2\2\2\17O\3\2\2\2\21U\3\2\2\2\23^\3\2\2\2"+
		"\25b\3\2\2\2\27p\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\u0082\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2"+
		")\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0095\3\2\2\2\61\u0098"+
		"\3\2\2\2\63\u009b\3\2\2\2\65\u009d\3\2\2\2\67\u009f\3\2\2\29\u00a7\3\2"+
		"\2\2;\u00ad\3\2\2\2=\u00b9\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2"+
		"\2\2CD\7}\2\2D\b\3\2\2\2EF\7\177\2\2F\n\3\2\2\2GH\7k\2\2HI\7h\2\2I\f\3"+
		"\2\2\2JK\7g\2\2KL\7n\2\2LM\7u\2\2MN\7g\2\2N\16\3\2\2\2OP\7y\2\2PQ\7j\2"+
		"\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\20\3\2\2\2UV\7h\2\2VW\7w\2\2WX\7p\2\2X"+
		"Y\7e\2\2YZ\7v\2\2Z[\7k\2\2[\\\7q\2\2\\]\7p\2\2]\22\3\2\2\2^_\7x\2\2_`"+
		"\7c\2\2`a\7t\2\2a\24\3\2\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7v"+
		"\2\2g\26\3\2\2\2hl\t\2\2\2ik\t\3\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mq\3\2\2\2nl\3\2\2\2oq\7\62\2\2ph\3\2\2\2po\3\2\2\2q\30\3\2\2\2"+
		"rs\7v\2\2st\7t\2\2tu\7w\2\2u|\7g\2\2vw\7h\2\2wx\7c\2\2xy\7n\2\2yz\7u\2"+
		"\2z|\7g\2\2{r\3\2\2\2{v\3\2\2\2|\32\3\2\2\2}~\7p\2\2~\177\7w\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7n\2\2\u0081\34\3\2\2\2\u0082\u0083\7,\2\2\u0083\36"+
		"\3\2\2\2\u0084\u0085\7\61\2\2\u0085 \3\2\2\2\u0086\u0087\7=\2\2\u0087"+
		"\"\3\2\2\2\u0088\u0089\7-\2\2\u0089$\3\2\2\2\u008a\u008b\7/\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7\'\2\2\u008d(\3\2\2\2\u008e\u008f\7>\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7@\2\2\u0091,\3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094"+
		"\7?\2\2\u0094.\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097\60"+
		"\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\62\3\2\2\2\u009b"+
		"\u009c\7?\2\2\u009c\64\3\2\2\2\u009d\u009e\7.\2\2\u009e\66\3\2\2\2\u009f"+
		"\u00a3\t\4\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a48\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a8\7\17\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\b\35\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b3\3\2\2\2\u00b0\u00b2\n\6\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\b\36\2\2\u00b7<\3\2\2\2\u00b8\u00ba\t\7\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\37\2\2\u00be>\3\2\2\2\n\2l"+
		"p{\u00a3\u00a7\u00b3\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}