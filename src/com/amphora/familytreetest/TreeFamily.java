package com.amphora.familytreetest;

public class TreeFamily {

	static int count = 0;

	public void preorder(Node  greatGrantParents,Node grandParent, Node parent, Node kids,Node grandKids, Node left, int sum) {
		if (greatGrantParents!=null && grandParent != null && parent != null && kids != null && grandKids != null
				&& (greatGrantParents.data+grandParent.data + parent.data + kids.data+grandKids.data) > sum) {
			count++;

		}
		if (kids == null)
			return;
		preorder(parent, kids, kids.left, parent,grandKids, grandKids.left, sum);
		preorder(parent, kids, kids.right,parent, grandKids, grandKids.left, sum);
	}

	public static void main(String args[]) {
		Node r10 = new Node(10);
		Node r1 = new Node(1);
		Node r22 = new Node(22);
		Node r35 = new Node(35);
		Node r4 = new Node(4);
		Node r15 = new Node(15);
		Node r67 = new Node(67);
		Node r57 = new Node(57);
		Node r38 = new Node(38);
		Node r9 = new Node(9);
		Node r10_2 = new Node(10);
		Node r110 = new Node(110);
		Node r312 = new Node(312);
		Node r131 = new Node(131);
		Node r414 = new Node(414);
		Node r8 = new Node(8);
		Node r39 = new Node(39);

		r10.left = r1;
		r10.right = r22;
		r1.left = r35;
		r1.right = r4;
		r22.left = r15;
		r22.right = r67;
		r35.left = r57;
		r35.right = r38;
		r4.left = r9;
		r4.right = r10_2;
		r15.left = r110;
		r15.right = r312;
		r67.left = r131;
		r67.right = r414;
		r312.left = r8;
		r414.right = r39;

		TreeFamily p = new TreeFamily();
		p.preorder(null, null, r10, r39, r39, r39, 100);
		System.out.println(count);
	}

}
