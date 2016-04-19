import java.util.ArrayList;
import java.util.Iterator;

class TreeNode{
	public char letter;
	public ArrayList<TreeNode> children;
	public TreeNode(char letter){
		this.letter=letter;
		this.children = new ArrayList<TreeNode>();
	}
}
public class LowestCommonAncestor {
	
	static void lca(TreeNode root, char v1, char v2){
		if(root != null){
			System.out.println(root.letter);
			if(root.letter == v1){
				
			}
			if(root.letter == v2){
				
			}
			Iterator<TreeNode> itr = root.children.iterator();
			while(itr.hasNext()){
				TreeNode node = itr.next();
				lca(node,v1,v2);
			}
		}
	}
	
	public static void main(String args[]){
		TreeNode root = new TreeNode('A');
		root.children.add(new TreeNode('B'));
		root.children.add(new TreeNode('C'));
		root.children.get(0).children.add(new TreeNode('D'));
		root.children.get(0).children.add(new TreeNode('E'));
		root.children.get(0).children.add(new TreeNode('F'));
		root.children.get(1).children.add(new TreeNode('G'));
		root.children.get(0).children.get(0).children.add(new TreeNode('H'));
		root.children.get(0).children.get(0).children.add(new TreeNode('I'));
		root.children.get(0).children.get(2).children.add(new TreeNode('J'));
		root.children.get(0).children.get(2).children.get(0).children.add(new TreeNode('M'));
		root.children.get(1).children.get(0).children.add(new TreeNode('K'));
		root.children.get(1).children.get(0).children.add(new TreeNode('L'));
		
		lca(root, 'E', 'J');
	}
}
