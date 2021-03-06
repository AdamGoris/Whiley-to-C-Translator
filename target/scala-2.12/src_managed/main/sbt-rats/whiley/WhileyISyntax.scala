// AUTOMATICALLY GENERATED by sbt-rats - EDIT AT YOUR OWN RISK

package whiley


object WhileyISyntax {

    sealed abstract class ASTNode extends Product
    
    case class Program (optStms : Vector[Stm]) extends ASTNode
     
    sealed abstract class Stm extends ASTNode
    case class PackageDecl (loc : Loc, optDotLocs : Vector[DotLoc]) extends Stm  
    case class ImportDecl (locOrStar : LocOrStar, loc : Loc, optDotLocOrStars : Vector[DotLocOrStar]) extends Stm  
    case class Public (stm : Stm) extends Stm  
    case class Private (stm : Stm) extends Stm  
    case class Native (stm : Stm) extends Stm  
    case class Export (stm : Stm) extends Stm  
    case class DeclAsgn (typeField : Type, lVal : LVal, optCommTypeLocs : Vector[CommTypeLoc], exp : Exp, optCommExps : Vector[CommExp]) extends Stm  
    case class Decl (typeField : Type, lVal : LVal) extends Stm  
    case class Asgn (assign : Exp) extends Stm  
    case class TypeDecl (loc : Loc, typeField : Type, optLoc : Option[Loc], optWhereExprs : Vector[WhereExpr]) extends Stm  
    case class ConstDecl (loc : Loc, exp : Exp) extends Stm  
    case class If (exp : Exp, optStms : Vector[Stm], optElseIfs : Vector[ElseIf], optElse : Option[Else]) extends Stm  
    case class Switch (exp : Exp, optCaseStms : Vector[CaseStm]) extends Stm  
    case class While (exp : Exp, optWhereExprs : Vector[WhereExpr], optStms : Vector[Stm]) extends Stm  
    case class DoWhile (optStms : Vector[Stm], exp : Exp, optWhereExprs : Vector[WhereExpr]) extends Stm  
    case class FnDecl (loc : Loc, optParameters : Option[Parameters], optReturnType : Option[ReturnType], optRequiresEnsuress : Vector[RequiresEnsures], optStms : Vector[Stm]) extends Stm  
    case class MthdDecl (loc : Loc, optParameters : Option[Parameters], optReturnType : Option[ReturnType], optRequiresEnsuress : Vector[RequiresEnsures], optStms : Vector[Stm]) extends Stm  
    case class RtnStm (exp : Exp, optCommExps : Vector[CommExp]) extends Stm  
    case class Assert (exp : Exp) extends Stm  
    case class Assume (exp : Exp) extends Stm  
    case class DebugExp (exp : Exp) extends Stm  
    case class SkipStm () extends Stm  
    case class BreakStm () extends Stm  
    case class ContStm () extends Stm  
    case class FailStm () extends Stm  
     
    sealed abstract class Type extends ASTNode
    case class Union (unionType : Type) extends Type  
    case class IntrsctnType (intersectionType : Type) extends Type  
     
    case class UnionType (intersectionType : Type, optIntersectionTypes : Vector[Type]) extends Type  
     
    case class IntersectionType (termType : Type, optTermTypes : Vector[Type]) extends Type  
     
    case class RecType (recordType : Type) extends Type  
    case class RefType (referenceType : Type) extends Type  
    case class ArrType (arrayType : Type) extends Type  
    case class NegType (negationType : Type) extends Type  
    case class FuncType (functionType : Type) extends Type  
    case class MthdType (methodType : Type) extends Type  
    case class NmnlType (identifier : String) extends Type  
     
    case class NullType () extends Type  
    case class IntType () extends Type  
    case class ByteType () extends Type  
    case class BoolType () extends Type  
    case class RealType () extends Type  
     
    case class RecordType (mixedType : MixedType, optCommMixedTypes : Vector[CommMixedType]) extends Type  
     
    sealed abstract class MixedType extends ASTNode
    case class Mix (typeField : Type, loc : Loc) extends MixedType  
    case class MixFunc (loc : Loc, parameters1 : Parameters, parameters2 : Parameters) extends MixedType  
    case class MixMthd (loc : Loc, parameters1 : Parameters, parameters2 : Parameters) extends MixedType  
     
    case class CommMixedType (mixedType : MixedType) extends ASTNode
     
    sealed abstract class ReferenceType extends ASTNode
     
    case class NominalType (identifier : String) extends Type  
     
    sealed abstract class ArrayType extends ASTNode
     
    sealed abstract class NegationType extends ASTNode
     
    case class FunctionType (parameters1 : Parameters, parameters2 : Parameters) extends Type  
     
    case class MethodType (parameters1 : Parameters, parameters2 : Parameters) extends Type  
     
    sealed abstract class Exp extends ASTNode with org.bitbucket.inkytonik.kiama.output.PrettyExpression
    case class Iff (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 10
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Implies (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 9
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Or (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 8
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class Xor (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 7
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class And (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 6
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class BitWiseAnd (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 6
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class EQ (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 5
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class NE (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 5
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class LT (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 4
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class LE (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 4
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class GT (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 4
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class GE (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 4
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Lsh (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 3
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class ARsh (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 3
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Add (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 2
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Sub (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 2
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Mul (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 1
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Div (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 1
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Rem (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 1
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class Not (exp : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Prefix
    }
    case class Neg (exp : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Prefix
    }
    case class FunctionCall (loc : Loc, exp : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class ArrAccess (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 1
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class ArrGen (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class ArrInit (optExps : Vector[Exp], exp : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class ExpList (exp1 : Exp, exp2 : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 1
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.LeftAssoc)
    }
    case class QuantifierExp (quantExp : QuantExp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class Use (loc : Loc) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
     
    case class Assign (lVal : LVal, exp : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
     
    sealed abstract class WhereExpr extends ASTNode
    case class WhereExp (exp : Exp) extends WhereExpr  
     
    case class QuantExp (noSomeAll : NoSomeAll, loc : Loc, exp1 : Exp, optCommLocInExps : Vector[CommLocInExp], exp2 : Exp) extends ASTNode
     
    sealed abstract class NoSomeAll extends ASTNode
    case class No () extends NoSomeAll  
    case class Some () extends NoSomeAll  
    case class All () extends NoSomeAll  
     
    case class ElseIf (exp : Exp, optStms : Vector[Stm]) extends ASTNode
     
    case class Else (optStms : Vector[Stm]) extends ASTNode
     
    sealed abstract class CaseStm extends ASTNode
    case class Case (exp : Exp, optCommExps : Vector[CommExp], optStms : Vector[Stm]) extends CaseStm  
    case class DefaultCase (optStms : Vector[Stm]) extends CaseStm  
     
    sealed abstract class RequiresEnsures extends ASTNode
    case class Requires (exp : Exp) extends RequiresEnsures  
    case class Ensures (exp : Exp) extends RequiresEnsures  
     
    sealed abstract class Parameters extends ASTNode
    case class Params (typeLoc : TypeLoc, optCommTypeLocs : Vector[CommTypeLoc]) extends Parameters  
    case class TypeParam (typeField : Type) extends Parameters  
     
    sealed abstract class ReturnType extends ASTNode
    case class RtnParams (parameters : Parameters) extends ReturnType  
    case class RtnType (typeField : Type) extends ReturnType  
     
    case class NullLit (nullLiteral : NullLiteral) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class ByteLit (byteLiteral : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class IntLit (integerLiteral : Int) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class BoolLit (booleanLiteral : Exp) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class CharLit (characterLiteral : CharacterLiteral) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class StringLit (stringLiteral : StringLiteral) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
     
    case class NullLiteral () extends ASTNode
     
    case class ByteLiteral (optBits : Vector[String]) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
       
    case class False () extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
    case class True () extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
     
    case class CharacterLiteral (character : String) extends ASTNode
     
    case class StringLiteral (optCharacters : Vector[String]) extends ASTNode
          
    sealed abstract class LVal extends ASTNode
    case class FieldAsgn (loc : Loc, identifier : String) extends LVal  
    case class ListAsgn (loc : Loc, exp : Exp) extends LVal  
    case class Pointer (exp : Exp) extends LVal  
    case class IdnAsgn (identifier : String) extends LVal  
     
    case class Loc (identifier : String) extends ASTNode
     
    case class Len (loc : Loc) extends Exp with org.bitbucket.inkytonik.kiama.output.PrettyNaryExpression {
        val priority = 0
        val fixity = org.bitbucket.inkytonik.kiama.output.Infix (org.bitbucket.inkytonik.kiama.output.NonAssoc)
    }
      
    case class CommExp (exp : Exp) extends ASTNode
     
    case class CommLoc (loc : Loc) extends ASTNode
     
    case class CommLocInExp (loc : Loc, exp : Exp) extends ASTNode
     
    case class CommLit (lit : Exp) extends ASTNode
     
    case class CommTypeLoc (typeLoc : TypeLoc) extends ASTNode
     
    case class DotLoc (loc : Loc) extends ASTNode
     
    sealed abstract class LocOrStar extends ASTNode
    case class ImpAll () extends LocOrStar  
    case class Spcfc (loc : Loc) extends LocOrStar  
     
    case class DotLocOrStar (locOrStar : LocOrStar) extends ASTNode
     
    case class TypeLoc (typeField : Type, loc : Loc) extends ASTNode
    
}
