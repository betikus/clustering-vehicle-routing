����   9 H  ru/clustering/Cluster  java/lang/Object points Ljava/util/List; 	Signature 'Ljava/util/List<Lru/clustering/Point;>; demands %Ljava/util/List<Ljava/lang/Integer;>; centroid Lru/clustering/Point; id I <init> (I)V Code
     ()V	      java/util/ArrayList
  	    	   	 	     LineNumberTable LocalVariableTable this Lru/clustering/Cluster; 	getPoints ()Ljava/util/List; )()Ljava/util/List<Lru/clustering/Point;>; addPoint (Lru/clustering/Point;)V * , + java/util/List - . add (Ljava/lang/Object;)Z point 	addDemand
 2 4 3 java/lang/Integer 5 6 valueOf (I)Ljava/lang/Integer; demand 
getDemands '()Ljava/util/List<Ljava/lang/Integer;>; 	setPoints (Ljava/util/List;)V *(Ljava/util/List<Lru/clustering/Point;>;)V LocalVariableTypeTable getCentroid ()Lru/clustering/Point; setCentroid getId ()I clear * E C  
SourceFile Cluster.java !                	       
           
        m     %*� *� *� Y� � *� Y� � *� �               	      $  !       % " #     %     $ %      &    /     *� �             !        " #    ' (     D     *� +� ) W�        
       !        " #      /    0      G     *� � 1� ) W�        
       !        " #      7    8 %      9    /     *� �              !        " #    : ;      <    P     *+� �        
    $  % !        " #         =            > ?     /     *� �            ( !        " #    @ (     >     *+� �        
    ,  - !        " #          A B     /     *� �            0 !        " #    C      E     *� � D *� � D �            4 	 5  6 !        " #    F    G