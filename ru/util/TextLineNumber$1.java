����   9 N  ru/util/TextLineNumber$1  java/lang/Object  java/lang/Runnable this$0 Lru/util/TextLineNumber; <init> (Lru/util/TextLineNumber;)V Code	    
   	  ()V LineNumberTable LocalVariableTable this Lru/util/TextLineNumber$1; run	    ru/util/TextLineNumber   	component !Ljavax/swing/text/JTextComponent;
    javax/swing/text/JTextComponent   ! getDocument ()Ljavax/swing/text/Document; # % $ javax/swing/text/Document & ' 	getLength ()I
  ) * + modelToView2D (I)Ljava/awt/geom/Rectangle2D; - java/awt/Rectangle	 , / 0 1 y I	  3 4 1 
lastHeight
  6 7  setPreferredWidth
  9 : ; 	getParent ()Ljava/awt/Container;
 = ? > java/awt/Container @  repaint B %javax/swing/text/BadLocationException endPos rect Ljava/awt/Rectangle; StackMapTable 
SourceFile TextLineNumber.java EnclosingMethod K  documentChanged InnerClasses NestHost               	 
     4     
*+� *� �                  
            �     R*� � � � " <*� � � (� ,M,� 1,� .*� � 2� #*� � 5*� � 8� <*� ,� .� 2� L�    M P A     & 	    ! # 1% 8' B( M* P+ Q,         R      = C 1   . D E  F   	 � P A   G    H I     J L   
         M    