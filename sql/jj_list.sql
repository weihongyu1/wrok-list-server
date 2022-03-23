-- 用户表
CREATE TABLE `account` (
                           `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                           `user_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户账号',
                           `passwd` varchar(255) NOT NULL COMMENT '用户密码',
                           `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `unique_account` (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- 分类标签
CREATE TABLE `tag` (
                       `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                       `tag` varchar(50) NOT NULL COMMENT '功能标签',
                       `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                       `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO tag(tag) VALUES('工作任务');
INSERT INTO tag(tag) VALUES('个人备忘');
INSERT INTO tag(tag) VALUES('购物清单');
INSERT INTO tag(tag) VALUES('学习安排');

-- 任务
CREATE TABLE `task` (
                        `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                        `task` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户任务',
                        `edit` varchar(255) NOT NULL COMMENT '任务描述',
                        `task_time` datetime NOT NULL COMMENT '执行时间',
                        `flag` int NOT NULL DEFAULT (0) COMMENT '是否已完成，完成：0，未完成：1',
                        `tag_id` int NOT NULL COMMENT '标签id',
                        `account_id` int NOT NULL,
                        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                        PRIMARY KEY (`id`),
                        KEY `tag_id` (`tag_id`),
                        KEY `task_ibfk_2` (`account_id`),
                        CONSTRAINT `task_ibfk_1` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`id`),
                        CONSTRAINT `task_ibfk_2` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;