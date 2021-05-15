����   9 z  ru/clustering/Point  java/lang/Object x D y cluster_number I <init> (DD)V Code
   
  ()V	    	    	    	
     setX (D)V
     setY LineNumberTable LocalVariableTable this Lru/clustering/Point; getX ()D getY 
setCluster (I)V n 
getCluster ()I distance -(Lru/clustering/Point;Lru/clustering/Point;)D
  , # "@       
 0 2 1 java/lang/Math 3 4 pow (DD)D
  6 ! "
 0 8 9 : sqrt (D)D p centroid createRandomPoint (II)Lru/clustering/Point; @ java/util/Random
 ? 
 ? C D " 
nextDouble
  F 
  min max r Ljava/util/Random; createRandomPoints (III)Ljava/util/List; 	Signature ,(III)Ljava/util/List<Lru/clustering/Point;>; P java/util/ArrayList
 O R 
 %
  T = > V X W java/util/List Y Z add (Ljava/lang/Object;)Z number points Ljava/util/List; i LocalVariableTypeTable 'Ljava/util/List<Lru/clustering/Point;>; StackMapTable toString ()Ljava/lang/String; e java/lang/StringBuilder g (
 d i 
 j (Ljava/lang/String;)V
 d l m n append (D)Ljava/lang/StringBuilder; p ,
 d r m s -(Ljava/lang/String;)Ljava/lang/StringBuilder; u )
 d w b c 
SourceFile 
Point.java !                  	     
      t     *� *� *� *� *'� *)� �             	 	 
                                          >     *'� �       
                           ! "     /     *� �                                >     *'� �       
                           # "     /     *� �                           $ %     >     *� �       
    $  %                 & 	   ' (     /     *� �           (              	 ) *     W     #+� +*� +g -� /+� 5*� 5g -� /c� 7�           ,        # ;       # <    	 = >     �     .� ?Y� AM�d�,� BkcJ�d�,� Bkc9� Y)� E�           0  1  2 # 3    4    . G 	     . H 	   & I J       #     	 K L  M    N    �     &� OY� QN6� -� S� U W����-�           7 	 8  9  8 $ ;    4    & G 	     & H 	    & [ 	  	  \ ]    ^ 	  _     	  \ `  a   
 �  V  b c     O     %� dYf� h*� � ko� q*� � kt� q� v�           ?        %       x    y