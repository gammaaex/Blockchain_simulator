/*
Raftのプログラム
・前提
1,各ノードは故障しない
2,最初は各ノードは役割を持っていないものとする(リーダー選出から始まる)
*/

class Raft{
    int commit = 0; //どれだけコミットされたかカウントする
    int norma; //全てのノードにブロックが"norma"回追加するまでシミュレートする
    int nodes; //ノード数
    int turn = 0;//経過ターン数
    int messageNum = 0;//メッセージ数

    //コンストラクタ
    Raft(int norma,int node){
        this.norma = norma;
        this.nodes = node;
    }
    Raft(){
        //エラー
    }

    public int getMessageNum(){
        return messageNum;
    }

    public int getTurn(){
        return turn;
    }

    public void run(){
        //ノードを指定分作成する
        RaftNode[] node = new RaftNode[nodes]; 
        for(int i = 0; i < nodes; i++){
            node[i] = new RaftNode();
        }

        while(commit < norma){
            /////
        }
        return;
    }
}