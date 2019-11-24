# Bioinformatics-Final-Project

Introduction to Bioinformatics

Fall 2019

CS723 Programming Project 

Reduced Representation of a Protein Structure

Assigned 11/7/19, due 12/9/2019

Cluster of atoms

There are three purposes in this project.

(1) To be able to work with actual protein structure data from the database

(2) To be able to perform basic calculation using the data

(3) To realize that complex data can be simplified for certain purposes

Task 1 (30%) – Parsing a protein structure extracted from the Protein Data Bank (PDB)

The input is a protein structure file in the format of PDB. Your program will take the name of the PDB file, given by a user, and output a file containing only the alpha-carbon (CA) atoms of the first chain in the protein. Note that there might be multiple chains in a protein. The output file is in PDB format, so that you can load and visualize in Chimera. You may just extract the lines of CA atoms in the input file.

Task 2 (70%) – Reduced representation of helices and beta-strands 

The reduced representation of a helix is a set of points near the central axis of the helix. Utilizing the natural of spiral in the helix, an axis point can be obtained from the geometric center of four consecutive points CA_i, CA_(i+1), CA_(i+2), and CA_(i+3) of the helix, where CA is an alpha-carbon, and i is the index of the amino acid. 

The reduced representation of a beta-strand is a set of points near the central line of the beta-strand. A point of the central line is defined as the geometric center of four consecutive backbone atoms (without O). As an example, a point can be the geometric center of N_i, CA_i, C_i , and N_(i+1) where N_i, CA_i, C_i , and N_(i+1) represent the i-th nitrogen, alpha-carbon, carbon, and i+1-th nitrogen atoms respectively on the beta-strand.  Alternatively, the geometric center of CA_i, C_i , N_(i+1), and CA_(i+1) can also be a point on the central line. 

Your programs are expected to perform the following tasks.

(1) Take an input file from a user in the format of PDB. 

(2) Output a PDB file containing only those points on the axes of helices. You may use “S” as the label for an axis point in the PDB file. This allows you to load the file for visualization in Chimera. Carbon (CA, CB etc), nitrogen (N), and oxygen (O) atoms are most popular in a protein. Sometimes a Sulphur atom (labeled as “S”) appears in a protein. We create an artificial axis using Sulphur atoms to visualize in Chimera. 

(3) Output a PDB file of those points in the central lines of beta-strands. You may also use “S” as the label for the point in the PDB file.

If your output file contains points of all axes, you may insert a line between two helices. The line should just contain only one word “TER” to separate two helices. You may refer to the online definition of PDB format about TER. 


#Bioinformatics-Final-Project-Extra-Credit

Calculate the translation and rotation involved to align two helices.

In this task, you are expected to write a program to align two helices given by a user as two PDB files. The alignment is based on the central axis of each helix. In order to analyze many structures, they are often aligned using a pre-defined rule. Translation and rotation are fundamental techniques to work with 3-dimensional data. One way to do it is to calculate the translation involved to merge the two centers of your axes. Then you can calculate the rotation involved to align the two axes. Once the translation and rotation are identified, they can be applied to one of the two helices.
