/* Generated By:JJTree&JavaCC: Do not edit this line. RuleParserTokenManager.java */
package com.oxymedical.component.rulesComponent.parser.javacc;

public class RuleParserTokenManager implements RuleParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8L) != 0L)
            return 2;
         if ((active0 & 0x40L) != 0L)
            return 1;
         if ((active0 & 0x6L) != 0L)
            return 3;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStartNfaWithStates_0(0, 3, 2);
      case 10:
         return jjStartNfaWithStates_0(0, 1, 3);
      case 13:
         return jjStartNfaWithStates_0(0, 2, 3);
      case 47:
         return jjStartNfaWithStates_0(0, 6, 1);
      case 60:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x7ffffffff80L);
      case 62:
         return jjStopAtPos(0, 5);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa2_0(active0, 0x4aa4aa54a00L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x34034000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1020000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x180180L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400008000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x3400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x403400L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x48048000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x2040000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x34234000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000200200L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x800010000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000180180L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x4800L);
      case 121:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(3, 17);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(3, 24);
         break;
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x804800L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x580000000L);
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000580180L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x34034000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x48048000000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x200008000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000003400L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200200L);
      case 121:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(4, 18);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 25);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(4, 36);
         break;
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x34000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0xa00188180L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x403400L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000a00200L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x48448000000L);
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x180004800L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x34000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 62:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(5, 15);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(5, 19);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(5, 34);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(5, 37);
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x180003400L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x48000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x34000610200L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x34804800L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x48000000180L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(6, 16);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(6, 21);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(6, 35);
         break;
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x200004800L);
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x3400L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x48000800180L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x48000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x500000L);
      case 113:
         return jjMoveStringLiteralDfa7_0(active0, 0x34000000000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x1b4000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      case 98:
         return jjMoveStringLiteralDfa8_0(active0, 0x4800L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x34000000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x3400L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x180000000L);
      case 113:
         return jjMoveStringLiteralDfa8_0(active0, 0x48000000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x248000180L);
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x34000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      case 62:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(8, 7);
         break;
      case 99:
         return jjMoveStringLiteralDfa9_0(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x34000403400L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x48000000L);
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x4800L);
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x100000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x234000000L);
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x180000000L);
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x48000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa10_0(active0, 0x100002000L);
      case 45:
         return jjMoveStringLiteralDfa10_0(active0, 0x400L);
      case 62:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(9, 9);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(9, 12);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(9, 22);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(9, 31);
         break;
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x48000904800L);
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0x34034000100L);
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x48000000L);
      case 114:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa11_0(active0, 0x20000000L);
      case 45:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000800L);
      case 61:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(10, 20);
         break;
      case 62:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(10, 14);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(10, 23);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(10, 28);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(10, 33);
         break;
      case 97:
         return jjMoveStringLiteralDfa11_0(active0, 0x100L);
      case 99:
         return jjMoveStringLiteralDfa11_0(active0, 0x34000000000L);
      case 108:
         return jjMoveStringLiteralDfa11_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x48148002000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private final int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa12_0(active0, 0x8000000L);
      case 62:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(11, 30);
         break;
      case 97:
         return jjMoveStringLiteralDfa12_0(active0, 0x100002000L);
      case 99:
         return jjMoveStringLiteralDfa12_0(active0, 0x48000000000L);
      case 101:
         return jjMoveStringLiteralDfa12_0(active0, 0x34000000000L);
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x400L);
      case 108:
         return jjMoveStringLiteralDfa12_0(active0, 0x4000800L);
      case 109:
         return jjMoveStringLiteralDfa12_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa12_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private final int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa13_0(active0, 0x20000000000L);
      case 45:
         return jjMoveStringLiteralDfa13_0(active0, 0x4000000000L);
      case 62:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(12, 40);
         break;
      case 97:
         return jjMoveStringLiteralDfa13_0(active0, 0x20000000L);
      case 101:
         return jjMoveStringLiteralDfa13_0(active0, 0x48000000100L);
      case 105:
         return jjMoveStringLiteralDfa13_0(active0, 0x4000800L);
      case 108:
         return jjMoveStringLiteralDfa13_0(active0, 0x8000000L);
      case 109:
         return jjMoveStringLiteralDfa13_0(active0, 0x100002000L);
      case 115:
         return jjMoveStringLiteralDfa13_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private final int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa14_0(active0, 0x8000000000L);
      case 61:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(13, 8);
         break;
      case 62:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(13, 42);
         break;
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x100002000L);
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa14_0(active0, 0x4000000000L);
      case 109:
         return jjMoveStringLiteralDfa14_0(active0, 0x20000000L);
      case 110:
         return jjMoveStringLiteralDfa14_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa14_0(active0, 0x4000800L);
      case 116:
         return jjMoveStringLiteralDfa14_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private final int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(14, 13);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(14, 32);
         break;
      case 62:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(14, 10);
         break;
      case 97:
         return jjMoveStringLiteralDfa15_0(active0, 0x20000000000L);
      case 101:
         return jjMoveStringLiteralDfa15_0(active0, 0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa15_0(active0, 0x4000000000L);
      case 108:
         return jjMoveStringLiteralDfa15_0(active0, 0x8000000000L);
      case 115:
         return jjMoveStringLiteralDfa15_0(active0, 0x8000000L);
      case 116:
         return jjMoveStringLiteralDfa15_0(active0, 0x4000800L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private final int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(15, 29);
         break;
      case 62:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(15, 11);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(15, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa16_0(active0, 0x8000000000L);
      case 109:
         return jjMoveStringLiteralDfa16_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa16_0(active0, 0x4000000000L);
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private final int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(16, 27);
         break;
      case 101:
         return jjMoveStringLiteralDfa17_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa17_0(active0, 0x8000000000L);
      case 116:
         return jjMoveStringLiteralDfa17_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private final int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(17, 41);
         break;
      case 62:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(17, 38);
         break;
      case 116:
         return jjMoveStringLiteralDfa18_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private final int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(18, 39);
         break;
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 5;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x2ffff34700000000L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     jjCheckNAdd(1);
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(3);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAdd(0);
                  }
                  else if ((0x8400000000L & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(4);
                  }
                  else if ((0x100000200L & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(2);
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(0);
                  break;
               case 1:
                  if ((0x2ffff34700000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x100000200L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x2400L & l) == 0L)
                     break;
                  kind = 46;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0x8400000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 1:
                  if ((0x17fffffe17fffffeL & l) == 0L)
                     break;
                  kind = 44;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
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
      if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\74", "\76", "\57", 
"\74\162\165\154\145\163\145\164\76", "\74\162\165\154\145\163\145\164\40\156\141\155\145\75", 
"\74\57\162\165\154\145\163\145\164\76", "\74\166\141\162\151\141\142\154\145\55\154\151\163\164\76", 
"\74\57\166\141\162\151\141\142\154\145\55\154\151\163\164\76", "\74\166\141\162\151\141\142\154\145\76", 
"\74\166\141\162\151\141\142\154\145\40\156\141\155\145\75", "\74\57\166\141\162\151\141\142\154\145\76", "\74\164\171\160\145\76", 
"\74\57\164\171\160\145\76", "\74\151\144\76", "\74\57\151\144\76", "\74\162\165\154\145\76", 
"\74\162\165\154\145\40\156\141\155\145\75", "\74\57\162\165\154\145\76", "\74\163\141\154\151\145\156\143\145\76", 
"\74\57\163\141\154\151\145\156\143\145\76", "\74\151\146\76", "\74\57\151\146\76", 
"\74\143\157\156\144\151\164\151\157\156\55\154\151\163\164\76", "\74\57\143\157\156\144\151\164\151\157\156\55\154\151\163\164\76", 
"\74\143\157\156\144\151\164\151\157\156\76", "\74\143\157\156\144\151\164\151\157\156\40\156\141\155\145\75", 
"\74\57\143\157\156\144\151\164\151\157\156\76", "\74\157\160\145\162\141\164\157\162\76", 
"\74\157\160\145\162\141\164\157\162\40\156\141\155\145\75", "\74\57\157\160\145\162\141\164\157\162\76", "\74\164\150\145\156\76", 
"\74\57\164\150\145\156\76", "\74\165\162\154\76", "\74\57\165\162\154\76", 
"\74\143\157\156\163\145\161\165\145\156\143\145\55\154\151\163\164\76", "\74\57\143\157\156\163\145\161\165\145\156\143\145\55\154\151\163\164\76", 
"\74\143\157\156\163\145\161\165\145\156\143\145\76", "\74\143\157\156\163\145\161\165\145\156\143\145\40\156\141\155\145\75", 
"\74\57\143\157\156\163\145\161\165\145\156\143\145\76", null, null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xfffffffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[5];
private final int[] jjstateSet = new int[10];
protected char curChar;
public RuleParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public RuleParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 5; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
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
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
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

}