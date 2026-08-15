let todo = [];
let req = prompt("please Enter Your request");
while(true){
    if(req == "quit"){
        console.log("QUITING APP");
        break;
    }
    if(req == "list"){
        console.log("______________");
        for(let i=0; i<todo.length; i++){
            console.log(i+1, todo[i]);
        }
        console.log("_______________")
    }else if(req == "add"){
        let task = prompt("please Enter the task you want to add");
        todo.push(task);
        console.log("Task is added");

    }else if(req == "delete"){
        let idx = prompt("please Enter the task index");
        todo.splice(idx,1);
        console.log("Task deleted")
    } else {
        console.log("Wrong request");
    }
    req = prompt("please Enter Your request");

}