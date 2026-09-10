# include <bits/stdc++.h>
using namespace std;

/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(!head) return nullptr;

        unordered_map<Node*, Node*> map;
        Node* c=head;
        while(c) {
            map[c]=new Node(c->val);
            c=c->next;
        }
        c=head;
        while(c) {
            Node* cn=map[c];
            cn->next=map[c->next];
            cn->random=map[c->random];
            c=c->next;
        }
        return map[head];
    }
};
