grammar testparser;
import testlexer;

model : fm4confver modelname feature? relationship? constraint?;

fm4confver : FM4CONFversion;

modelname : MODELNAME ':' identifier;

feature : FEATURE identifier (',' identifier)*;

relationship: RELATIONSHIP relationshiprule (',' relationshiprule)*;

constraint: CONSTRAINT constraintrule (',' constraintrule)*;

identifier: NAME;

relationshiprule : MANDATORY '(' NAME ',' NAME ')'
                 | OPTIONAL '(' NAME ',' NAME ')'
                 | ALTERNATIVE '(' NAME (',' NAME)+ ')'
                 | OR '(' NAME (',' NAME)+ ')'
                 ;

constraintrule : REQUIRES '(' NAME ',' NAME ')'
                 | EXCLUDES '(' NAME ',' NAME ')'
                 ;