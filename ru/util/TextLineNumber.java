����   9�  ru/util/TextLineNumber  javax/swing/JPanel  javax/swing/event/CaretListener  "javax/swing/event/DocumentListener 
 !java/beans/PropertyChangeListener serialVersionUID J ConstantValue        LEFT F     CENTER?    RIGHT?�   OUTER Ljavax/swing/border/Border; HEIGHT I� 	component !Ljavax/swing/text/JTextComponent; 
updateFont Z 	borderGap currentLineForeground Ljava/awt/Color; digitAlignment minimumDisplayDigits 
lastDigits 
lastHeight lastLine fonts Ljava/util/HashMap; 	Signature =Ljava/util/HashMap<Ljava/lang/String;Ljava/awt/FontMetrics;>; <clinit> ()V Code 0 javax/swing/border/MatteBorder	 2 4 3 java/awt/Color 5 " GRAY
 / 7 8 9 <init> (IIIILjava/awt/Color;)V	  ;   LineNumberTable LocalVariableTable $(Ljavax/swing/text/JTextComponent;)V
  @ 8 A %(Ljavax/swing/text/JTextComponent;I)V this Lru/util/TextLineNumber;
  E 8 -	  G  
 I K J javax/swing/text/JTextComponent L M getFont ()Ljava/awt/Font;
  O P Q setFont (Ljava/awt/Font;)V
  S T U setBorderGap (I)V	 2 W X " RED
  Z [ \ setCurrentLineForeground (Ljava/awt/Color;)V
  ^ _ ` setDigitAlignment (F)V
  b c U setMinimumDisplayDigits
 I e f g getDocument ()Ljavax/swing/text/Document; i k j javax/swing/text/Document l m addDocumentListener '(Ljavax/swing/event/DocumentListener;)V
 I o p q addCaretListener $(Ljavax/swing/event/CaretListener;)V s font
 I u v w addPropertyChangeListener 8(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V getUpdateFont ()Z	  {   setUpdateFont (Z)V getBorderGap ()I	  �    � javax/swing/border/EmptyBorder
 � � 8 � (IIII)V � !javax/swing/border/CompoundBorder
 � � 8 � 9(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)V
  � � � 	setBorder (Ljavax/swing/border/Border;)V	  � % 
  � � - setPreferredWidth inner getCurrentLineForeground ()Ljava/awt/Color;	  � ! "
  � � � getForeground StackMapTable getDigitAlignment ()F	  � # ��   getMinimumDisplayDigits	  � $  i � � � getDefaultRootElement ()Ljavax/swing/text/Element; � � � javax/swing/text/Element �  getElementCount
 � � � java/lang/String � � valueOf (I)Ljava/lang/String;
 � � �  length
 � � � java/lang/Math � � max (II)I
  K
  � � � getFontMetrics '(Ljava/awt/Font;)Ljava/awt/FontMetrics;
 � � � java/awt/FontMetrics � � 	charWidth (C)I
  � � � 	getInsets ()Ljava/awt/Insets;	 � � � java/awt/Insets �  left	 � � �  right
  � � � getPreferredSize ()Ljava/awt/Dimension;
 � � � java/awt/Dimension � � setSize (II)V
  � � � setPreferredSize (Ljava/awt/Dimension;)V
  � � � root Ljavax/swing/text/Element; lines digits fontMetrics Ljava/awt/FontMetrics; width insets Ljava/awt/Insets; preferredWidth d Ljava/awt/Dimension; paintComponent (Ljava/awt/Graphics;)V
  � � �
 I �
  � � � getSize	 � � � 
 � � � java/awt/Graphics �  getClipBounds ()Ljava/awt/Rectangle; java/awt/Point	 java/awt/Rectangle  y
	 8 �
 I viewToModel2D (Ljava/awt/geom/Point2D;)I	  height
  isCurrentLine (I)Z
  � �
 � \ setColor
  � getTextLineNumber
 �  stringWidth (Ljava/lang/String;)I
 "# � 
getOffsetX
 %&' 
getOffsetY (ILjava/awt/FontMetrics;)I
 �)*+ 
drawString (Ljava/lang/String;II)V
-/. javax/swing/text/Utilities01 	getRowEnd %(Ljavax/swing/text/JTextComponent;I)I3 java/lang/Exception g Ljava/awt/Graphics; availableWidth clip Ljava/awt/Rectangle; rowStartOffset 	endOffset 
lineNumber Ljava/lang/String; x e Ljava/lang/Exception;
 IAB  getCaretPosition �DEF getElementIndex (I)I caretPosition �IJK 
getElement (I)Ljavax/swing/text/Element; �MN  getStartOffsetP   index line 
ExceptionsU %javax/swing/text/BadLocationException
 IWXY modelToView2D (I)Ljava/awt/geom/Rectangle2D;
 �[\  	getHeight
 �^_  
getDescent	 a ( )c java/util/HashMap
b E �fgh getAttributes !()Ljavax/swing/text/AttributeSet;	jlk javax/swing/text/StyleConstantsmn 
FontFamily Ljava/lang/Object;prq javax/swing/text/AttributeSetst getAttribute &(Ljava/lang/Object;)Ljava/lang/Object;	jvwn FontSizey java/lang/Integer{ java/lang/StringBuilder
 �} �~ &(Ljava/lang/Object;)Ljava/lang/String;
z� 8� (Ljava/lang/String;)V
z��� append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
z��� toString ()Ljava/lang/String;
b��t get� java/awt/Font
x��  intValue
�� 8+
b��� put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; r 
lineHeight descent i child as Ljavax/swing/text/AttributeSet; 
fontFamily fontSize Ljava/lang/Integer; key fm Ljava/awt/Font; caretUpdate !(Ljavax/swing/event/CaretEvent;)V	 � ' 
 ��� 	getParent ()Ljava/awt/Container;
��� java/awt/Container� - repaint Ljavax/swing/event/CaretEvent; currentLine changedUpdate $(Ljavax/swing/event/DocumentEvent;)V
 �� - documentChanged !Ljavax/swing/event/DocumentEvent; insertUpdate removeUpdate� ru/util/TextLineNumber$1
�� 8� (Lru/util/TextLineNumber;)V
��� javax/swing/SwingUtilities�� invokeLater (Ljava/lang/Runnable;)V propertyChange #(Ljava/beans/PropertyChangeEvent;)V
��� java/beans/PropertyChangeEvent�� getNewValue ()Ljava/lang/Object; evt  Ljava/beans/PropertyChangeEvent; newFont 
SourceFile TextLineNumber.java InnerClasses NestMembers !      	                                                                     ! "    #     $     %     &     '     ( )  *    +   , -  .   6      � /Y� 1� 6� :�    <   
       =       8 >  .   ?     *+� ?�    <   
    *  + =        B C          8 A  .   �     >*� D*+� F*+� H� N*� R*� V� Y*� ]*� a+� d*� h +*� n+r*� t�    <   .    -  / 	 1  3  4  5 " 6 ' 8 1 9 6 : = ; =        > B C     >      > $    x y  .   /     *� z�    <       ? =        B C    | }  .   >     *� z�    <   
    C  D =        B C          ~   .   /     *� ��    <       H =        B C    T U  .   |     **� �� �Y� �M*� �Y� :,� �� �*� �*� ��    <       M  N  O   P % Q ) R =        * B C     *       �    � �  .   J     *� �� 
*� �� *� ��    <       U =        B C   �    C 2  [ \  .   >     *+� ��    <   
    Z  [ =        B C      ! "   � �  .   /     *� ��    <       _ =        B C    _ `  .   z     *#�� � #�� �� #� ��    <       d  e  d  f =        B C      #   �    K J �        �   .   /     *� ��    <       j =        B C    c U  .   F     
*� �*� ��    <       o  p 	 q =       
 B C     
 $    � -  .  5  	   w*� F� d� � L+� � =� �� �*� �� �>*� �� N*� �**� �� �:0� �h6*� �:� �� �``6*� �:� �*� �*� �    <   :    u  v  w # z + | 0 } : ~ E  K � [ � a � j � p � v � =   \ 	   w B C    j � �   c �   # T �   : < � �  E 1 �   K + � �  [  �   a  � �  �   
 � v �  � �  .  �     �*+� �*� F*� F� H� �M*� �N*� �� �-� �d-� �d6+� �:*� F�Y���
6*� F�Y��`��
6� f*�� +*��� +*� ��*�:,�6	*	�!-� �`6
*,�$6+
�(*� F�,`6� :� 
����  g � �2  <   V    �  �  �  � , � 2 � H � d � g � p � { � � � � � � � � � � � � � � � � � � � � � =   �    � B C     �45   � � �   � � �  , �6   2 �78  H �9   d n:   � 7;<  � /  	 �  =  
 �    � >?  �   % � g   � � �  � A2   .   �     **� F�@=*� F� d� � N-�C -�C � ��    <       �  �  � & � ( � =   *    * B C     *9    "G     � �  �   	 � ( �  �  .   �     4*� F� d� � M,�C >,�H :�L � 
`� ��O�    <       �  �  �  � ) � 0 � =   4    4 B C     49    ' � �   Q    R �  �    � 0 � � # �  .   I     d�*� �j��    <       � =         B C     6        &' S    T .  �    *� F�V�N,�Z6-�-�`66-�� ,�]6� �*�`� *�bY�d�`*� F� d� � :�C 6�H :	6
� �	
�H :�e :�i�o � �:�u�o �x:�zY�|�����:*�`��� �:� +��Y����:*� F� �:*�`��W�]� �6�

	� � ��ed�    <   j    �  �  �  �   � ) � / � 2 � 9 � D � R � \ � g � m � x � � � � � � � � � � � � � � � � � � � � � � =   �    B C    9     � �  �8   ��    �     ��   R � � �  \ �Q   g �R � 	 j ��  
 x �� �  � {��  � l�<  � ]��  � G�<  � 9� �  �  s�  �   � � 2   �  � (   � � �  � �   � � � �p �x � �  �    � � �  �    �   ��  .   �     5*� F�@=*� F� d� � N-�C 6*��� *����*���    <       �  �  �  � '  . 4 =   4    5 B C     5>�   -G      � �   �   �   
 � 4 � ��  .   =     *���    <   
    	 =        B C     >�  ��  .   =     *���    <   
     =        B C     >�  ��  .   =     *���    <   
     =        B C     >�  � -  .   :     ��Y*�����    <   
    . =        B C   ��  .   �     2+����� **� z� +����M*,� N*� �*� �� 
*�����    <   & 	  3 
5 7 8 9 #: '; *> 1A =        2 B C     2��   ��  �    * �   ��   
 �      �    �