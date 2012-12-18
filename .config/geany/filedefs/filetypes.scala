# For complete documentation of this file, please see Geany's main documentation

[styling]
# foreground;background;bold;italic
#default=default
#comment=comment
#commentline=comment
#commentdoc=commentdoc
#number=number
#word=word
#word2=word2
#string=string
#character=string
#uuid=0x404080
#preprocessor=preprocessor
#operator=operator
#identifier=default
#stringeol=stringeol
# @"verbatim"
#verbatim=0x101030
# (/regex/)
#regex=0x105090
#commentlinedoc=commentdoc,bold
#commentdockeyword=commentdoc,bold,italic
#commentdockeyworderror=commentdoc
#globalclass=type
# Edit these in the colorscheme .conf file intead
default=default
comment=comment
commentline=comment
commentdoc=comment_doc
number=number_1
word=keyword_1
word2=keyword_2
string=string_1
character=string_1
uuid=other
preprocessor=preprocessor
operator=operator
identifier=identifier_1
stringeol=string_eol
verbatim=string_2
regex=regex
commentlinedoc=comment_doc
commentdockeyword=comment_doc_keyword
commentdockeyworderror=comment_doc_keyword_error
globalclass=class
# """verbatim"""
tripleverbatim=string_2

[keywords]
primary=abstract break case catch class def default do else extends finally for if implicit import lazy match new object override package private protected public return sealed super this throw trait try type val var while with yield
# all items must be in one line
secondary=true false null _ =>
# these are some scaladoc keywords
doccomment=author deprecated exception param return see serial serialData serialField since throws todo version

[settings]
# Vala uses the C lexer
lexer_filetype=C
tag_parser=Python

# default extension used when saving files
extension=scala

# the following characters are these which a "word" can contains, see documentation
#wordchars=_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789

# if only single comment char is supported like # in this file, leave comment_close blank
#comment_open=//
#comment_close=
# this is an alternative way, so multiline comments are used
comment_open=/*
comment_close=*/

[build_settings]
# %f will be replaced by the complete filename
# %e will be replaced by the filename without extension
# (use only one of it at one time)

[build-menu]
FT_00_LB=_Compile
FT_00_CM=fsc "%f"
FT_00_WD=
FT_01_LB=Run
FT_01_CM=scala %e
FT_01_WD=
FT_02_LB=
FT_02_CM=
FT_02_WD=
EX_00_LB=_Execute
EX_00_CM=./%e
EX_00_WD=
EX_01_LB=
EX_01_CM=
EX_01_WD=
