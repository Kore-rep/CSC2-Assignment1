#
# A makefile for CSC2 Assignment 1
# Angus Longmore
# 2020

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

#JFLAGS = -g
$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES= \
	LSDataPiece.class \
	LSArray.class \
	LSArrayApp.class \
	BinaryTreeNode.class \
	BTQueueNode.class \
	BTQueue.class \
	BinaryTree.class \
	BinarySearchTree.class \
	BSTApp.class  

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)
default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
run:
	java -cp bin LSArrayApp
run2:
	java -cp bin LSArrayApp "8" "16" "20"
run3:
	java -cp bin BSTApp
run4:
	java -cp bin BSTApp "8" "16" "20"
