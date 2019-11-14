
# 大学生能力培养体系平台
[![NPM version](https://img.shields.io/npm/v/vue-draggable-tags.svg)](https://www.npmjs.com/package/vue-draggable-tags) ![VueJS v2.x compatible](https://img.shields.io/badge/vue%202.x-compatible-green.svg)

## 注意  在dev分支上进行开发
### Clone 代码时
    $ git clone -b dev 仓库地址

### 或者 --- 先clone master分支，然后切换到dev分支
    $ git clone 仓库地址
    
    $ git checkout dev

### 安装依赖
    $ npm install
### 运行项目
    $ npm run dev

### 生成 ssh 密钥
    $ ssh-keygen -t rsa -C "xxxx@xx.xx"
### 复制密钥
    $ cat ~/.ssh/id_rsa.pub

### 查看分支状态
    $ git status
### 查看本地分支
    $ git branch
### 查看远程分支
    $ git branch -r
### 查看所有分支
    $ git branch -a

### 创建分支
    $ git branch [branch_name]
### 切换分支
    $ git checkout [branch_name]
### 推送分支到仓库
    $ git push origin [branch_name]

### 删除本地分支
    $ git branch -d [branch_name]
### 删除远程分支 :代表删除
    $ git push origin :[branch_name]

### 提交代码
    $ git add .
    
    $ git commit -m 'comment'
    
    $ git push origin [branch_name]
    
### 分支合并
    $ git checkout master
    
    $ git merge origin/[branch_name]
    
    $ git push
 
 ### 回退版本
    $ git reset --hard 版本号

## ☑ TODO

- [ ] 视图部分的 Views 视图未作处理
- [ ] 完善 README 文件
- [ ] 代码重构
