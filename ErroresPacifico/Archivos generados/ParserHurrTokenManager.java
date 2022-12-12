/* ParserHurrTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ParserHurrTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class ParserHurrTokenManager implements ParserHurrConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 46:
         return jjStopAtPos(0, 15);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 114;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddStates(0, 6); }
                  }
                  else if ((0x200100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(110, 58); }
                  else if (curChar == 44)
                  {
                     if (kind > 11)
                        kind = 11;
                     { jjCheckNAddStates(7, 14); }
                  }
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  else if (curChar == 32)
                  {
                     if (kind > 10)
                        kind = 10;
                     { jjCheckNAddStates(15, 39); }
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 8)
                        kind = 8;
                     { jjCheckNAddStates(40, 43); }
                  }
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 2:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAdd(25); }
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  { jjCheckNAdd(26); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 34:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 35:
                  if (curChar == 32)
                     { jjCheckNAddStates(44, 46); }
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(47, 49); }
                  break;
               case 37:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(37, 38); }
                  break;
               case 38:
                  if (curChar != 32)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAdd(38); }
                  break;
               case 39:
                  if (curChar != 32)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAddStates(50, 53); }
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 41:
                  if (curChar != 44)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 44:
                  if (curChar != 45)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAddStates(40, 43); }
                  break;
               case 45:
                  if (curChar != 45)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAdd(45); }
                  break;
               case 46:
                  if (curChar != 45)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddStates(54, 56); }
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjCheckNAddTwoStates(51, 52); }
                  break;
               case 52:
                  if (curChar != 44)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjCheckNAdd(52); }
                  break;
               case 54:
                  if (curChar != 32)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddStates(15, 39); }
                  break;
               case 55:
                  if (curChar != 32)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAdd(55); }
                  break;
               case 56:
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(56, 57); }
                  break;
               case 57:
                  if ((0x200100000000L & l) != 0L)
                     { jjCheckNAdd(58); }
                  break;
               case 58:
                  if ((0x200100000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 59:
                  if ((0x200100000000L & l) != 0L)
                     { jjCheckNAdd(60); }
                  break;
               case 60:
                  if ((0x200100000000L & l) != 0L)
                     { jjCheckNAddStates(57, 61); }
                  break;
               case 61:
                  if (curChar == 45)
                     { jjCheckNAddStates(62, 65); }
                  break;
               case 62:
                  if (curChar == 44)
                     { jjCheckNAddStates(66, 68); }
                  break;
               case 63:
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(63, 64); }
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddStates(69, 71); }
                  break;
               case 65:
                  if (curChar != 44)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddTwoStates(65, 66); }
                  break;
               case 66:
                  if (curChar != 32)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAdd(66); }
                  break;
               case 67:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddStates(72, 74); }
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddTwoStates(65, 66); }
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddStates(75, 80); }
                  break;
               case 71:
                  if (curChar == 32)
                     { jjCheckNAddStates(81, 92); }
                  break;
               case 72:
                  if (curChar == 32)
                     { jjCheckNAddStates(93, 101); }
                  break;
               case 74:
                  if (curChar != 44)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 91:
                  if (curChar == 44)
                     { jjCheckNAddStates(102, 106); }
                  break;
               case 92:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(92, 72); }
                  break;
               case 93:
                  if (curChar == 32)
                     { jjCheckNAddStates(107, 109); }
                  break;
               case 94:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(94, 95); }
                  break;
               case 95:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(96, 97); }
                  break;
               case 96:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(96, 97); }
                  break;
               case 98:
                  if (curChar != 44)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 99:
                  if (curChar == 32)
                     { jjCheckNAddStates(110, 112); }
                  break;
               case 100:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(100, 101); }
                  break;
               case 101:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(102, 103); }
                  break;
               case 102:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(102, 103); }
                  break;
               case 104:
                  if (curChar != 44)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 105:
                  if (curChar != 32)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddStates(113, 116); }
                  break;
               case 106:
                  if (curChar != 45)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddStates(117, 121); }
                  break;
               case 107:
                  if (curChar != 44)
                     break;
                  if (kind > 11)
                     kind = 11;
                  { jjCheckNAddStates(7, 14); }
                  break;
               case 108:
                  if (curChar != 44)
                     break;
                  if (kind > 11)
                     kind = 11;
                  { jjCheckNAdd(108); }
                  break;
               case 109:
                  if ((0x200100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(110, 58); }
                  break;
               case 110:
                  if ((0x200100000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 111;
                  break;
               case 111:
                  if ((0x200100000000L & l) != 0L)
                     { jjCheckNAdd(112); }
                  break;
               case 112:
                  if ((0x200100000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(112); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(110, 58); }
                  if ((0x9d1288L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAddStates(122, 124); }
                  }
                  else if (curChar == 69)
                     { jjCheckNAddStates(125, 128); }
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 6;
                  if ((0x800020L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  else if ((0x84000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                  }
                  else if (curChar == 67)
                     { jjCheckNAddTwoStates(48, 50); }
                  else if (curChar == 84)
                     { jjCheckNAddStates(129, 131); }
                  else if (curChar == 80)
                     { jjCheckNAdd(14); }
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 8;
                  if (curChar == 83)
                     { jjCheckNAddStates(132, 134); }
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 4:
                  if ((0x84000L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 5:
                  if ((0x800020L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 6:
                  if (curChar == 85 && kind > 19)
                     kind = 19;
                  break;
               case 7:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 79 && kind > 19)
                     kind = 19;
                  break;
               case 9:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 86 && kind > 19)
                     kind = 19;
                  break;
               case 11:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 66 && kind > 19)
                     kind = 19;
                  break;
               case 13:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 84 && kind > 19)
                     kind = 19;
                  break;
               case 15:
                  if (curChar == 80)
                     { jjCheckNAdd(14); }
                  break;
               case 16:
                  if (curChar == 84)
                     { jjCheckNAddStates(129, 131); }
                  break;
               case 17:
                  if (curChar == 68 && kind > 19)
                     kind = 19;
                  break;
               case 18:
                  if (curChar == 83 && kind > 19)
                     kind = 19;
                  break;
               case 19:
                  if (curChar == 89 && kind > 19)
                     kind = 19;
                  break;
               case 20:
                  if (curChar == 83)
                     { jjCheckNAddStates(132, 134); }
                  break;
               case 47:
                  if (curChar == 69)
                     { jjCheckNAddStates(125, 128); }
                  break;
               case 48:
                  if (curChar == 80 && kind > 9)
                     kind = 9;
                  break;
               case 49:
                  if (curChar == 88 && kind > 19)
                     kind = 19;
                  break;
               case 50:
                  if (curChar != 80)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjAddStates(135, 136); }
                  break;
               case 53:
                  if (curChar == 67)
                     { jjCheckNAddTwoStates(48, 50); }
                  break;
               case 57:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(58); }
                  break;
               case 58:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 59:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(60); }
                  break;
               case 60:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddStates(57, 61); }
                  break;
               case 70:
                  if ((0x9d1288L & l) != 0L)
                     { jjCheckNAddStates(122, 124); }
                  break;
               case 73:
                  if (curChar != 85)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 75:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 76:
                  if (curChar != 79)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 77:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if (curChar != 86)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 79:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar != 66)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 81:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar != 84)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 83:
                  if (curChar == 80)
                     { jjCheckNAdd(82); }
                  break;
               case 84:
                  if (curChar == 84)
                     { jjCheckNAddStates(137, 139); }
                  break;
               case 85:
                  if (curChar != 68)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 86:
                  if (curChar != 83)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 87:
                  if (curChar != 89)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 88:
                  if (curChar == 69)
                     { jjCheckNAddTwoStates(89, 82); }
                  break;
               case 89:
                  if (curChar != 88)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(74); }
                  break;
               case 90:
                  if (curChar == 83)
                     { jjCheckNAddStates(140, 142); }
                  break;
               case 97:
                  if ((0x84000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 103:
                  if ((0x800020L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 109:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(110, 58); }
                  break;
               case 110:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 111;
                  break;
               case 111:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(112); }
                  break;
               case 112:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(112); }
                  break;
               case 113:
                  if ((0x9d1288L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAddStates(122, 124); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 114 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   22, 25, 26, 27, 40, 41, 42, 108, 70, 92, 72, 40, 41, 71, 91, 55, 
   56, 57, 70, 72, 75, 77, 79, 81, 83, 93, 94, 95, 99, 100, 101, 105, 
   40, 41, 106, 84, 88, 90, 71, 91, 45, 46, 40, 41, 36, 37, 39, 36, 
   37, 38, 36, 37, 38, 39, 46, 40, 41, 60, 61, 62, 63, 69, 61, 62, 
   63, 69, 62, 63, 64, 65, 66, 67, 68, 65, 66, 62, 63, 65, 66, 67, 
   69, 70, 72, 75, 77, 79, 81, 83, 84, 88, 90, 71, 91, 72, 75, 77, 
   79, 81, 83, 84, 88, 90, 70, 92, 72, 71, 91, 93, 94, 95, 99, 100, 
   101, 105, 40, 41, 106, 105, 46, 40, 41, 106, 70, 71, 91, 48, 49, 14, 
   50, 17, 18, 19, 17, 18, 14, 51, 52, 85, 86, 87, 85, 86, 82, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\56", null, null, null, null, null, null, null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getEndLine();
      beginColumn = endColumn = input_stream.getEndColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 7;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 4 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String ocean= image.toString();
                ocean = ocean.replace(" ", "");
                matchedToken.image=ocean;
         break;
      case 21 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                                                                                                                                                            //TRACKEDENTRIES: NÚMERO DE ENTRADAS
                String name= image.toString();
                name = name.replace(" ", "");
                matchedToken.image=name;
         break;
      case 22 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String saveDate =image.toString();
                saveDate = saveDate.replace(" ", "");
                matchedToken.image=saveDate;
         break;
      case 23 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String rID = image.toString();
        //convertir rID en una lista
                String[] recID = rID.split(",",2);
        //Condición que verifica si esta vació el identificador de registro, lo remplace con "N/A"
                recID[0] = recID[0].replace(" ", "");
                if ( recID[0].isEmpty() )
                        {
                                recID[0] = "N/A";
                                //Llenar array con el status del sistema
                        }else{recID[1] = recID[1].replace(" ","");}
                                matchedToken.image = recID[0] + "," + recID[1];
         break;
      case 24 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String latitude = image.toString();
                latitude = latitude.replace(" ", "");
         break;
      case 25 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String longitude = image.toString();
                longitude = longitude.replace(" ", "");
         break;
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String fill = image.toString();
                //Reemplazar los valores a -999
                fill = fill.replace("-999","N/A");
                matchedToken.image=fill;
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ParserHurrTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public ParserHurrTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 114; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[114];
    static private final int[] jjstateSet = new int[2 * 114];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}
