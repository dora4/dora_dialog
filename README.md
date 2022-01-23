# DoraDialog

描述：底部弹出的对话框，可自定义对话框的视图

复杂度：★★★☆☆

分组：【Dora大控件组】

关系：暂无

技术要点：View视图层级DecorView、视图动画、ViewGroup添加View

### 照片

![avatar](https://github.com/dora4/dora_dialog/blob/main/art/dora_dialog.jpg)

### 动图

![avatar](https://github.com/dora4/dora_dialog/blob/main/art/dora_dialog.gif)

### 软件包

https://github.com/dora4/dora_dialog/blob/main/art/dora_dialog.apk

### 用法

```kotlin
val tvShowDialog = findViewById<TextView>(R.id.tvShowDialog)
        tvShowDialog.setOnClickListener {
            DoraDialog.Builder(this)
                    .create(DoraDialogWindow(R.layout.dialog_sample))
                    .onAttach(object : DoraDialog.OnAttachListener {
                        override fun onAttached(window: ADialogWindow) {
                            Toast.makeText(this@MainActivity, "onAttached", Toast.LENGTH_SHORT).show()
                        }
                    })
                    .toggle()
        }
```

| 类            | API     | 描述                                 |
| ------------- | ------- | ------------------------------------ |
| DoraDialog    | show    | 对话框显示                           |
| DoraDialog    | toggle  | 对话框显示状态则隐藏，隐藏状态则显示 |
| ADialogWindow | destroy | 隐藏或取消对话框                     |
